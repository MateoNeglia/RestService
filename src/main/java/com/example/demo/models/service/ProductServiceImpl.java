package com.example.demo.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.ProductDao;
import com.example.demo.models.entity.Producto;

@Service
public class ProductServiceImpl implements IProductService{
	
	@Autowired
	private ProductDao productoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {

		return (List<Producto>)productoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Producto findById(Long id) {

		return productoDao.findById(id).orElse(null);
	}

}
