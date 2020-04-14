package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.entity.Producto;
import com.example.demo.models.service.IProductService;

@RestController

public class ProductController {
	
	@Autowired
	private IProductService productoService;
	
	@GetMapping(path = "/listing")
	public List<Producto> listar(){
		return productoService.findAll();
	}
	
	@GetMapping(path = "/ver/{id}")
	public Producto detalle(@PathVariable Long id) {
		return productoService.findById(id);
	}
}
