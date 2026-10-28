package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.Producto;

public interface ProductService {
	
	Producto addProduct(Producto  producto);
	Producto findById(int id);
	List<Producto> listAllProducts();
	Producto updateProduct(Producto producto);
	int removeProduct(int id);

}
