package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.Producto;

public interface ProductService {
	
	Producto addProduct(Producto  producto);
	Producto findById(int id);
	List<Producto> listAllProducts();
	Producto updateProduct(Producto producto);
	int removeProduct(int id);
	String findByNombre(String nombre);
	List<Producto> findByNombreContaining(String texto);
	List<Producto> findByPrecioBetween(Integer min, Integer max);
	List<Producto> findByNombreAsc();
	List<Producto> findByNombreDesc();
	List<Producto> findByPrecioAsc();
	List<Producto> findByPrecioDesc();
	List<Producto> findByCategoriaNombre(String Nombre);

}
