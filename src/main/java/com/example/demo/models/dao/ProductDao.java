package com.example.demo.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.entity.Producto;

public interface ProductDao extends CrudRepository<Producto, Long>{

}
