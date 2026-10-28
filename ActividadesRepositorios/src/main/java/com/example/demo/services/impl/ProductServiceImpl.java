package com.example.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Producto;
import com.example.demo.repository.RepositorioProducto;
import com.example.demo.services.ProductService;

@Service("productService")
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private RepositorioProducto productRepository;

	@Override
	public Producto addProduct(Producto producto) {
		return productRepository.save(producto);
	}

	@Override
	public Producto findById(int id) {
		return productRepository.getReferenceById(id);
	}

	@Override
	public List<Producto> listAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public Producto updateProduct(Producto producto) {
		return productRepository.save(producto);
	}

	@Override
	public int removeProduct(int id) {
		productRepository.deleteById(id);
		return 0;
	}
	
	
}
