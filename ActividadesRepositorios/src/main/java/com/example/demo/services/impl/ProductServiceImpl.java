package com.example.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Sort;
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

	@Override
	public List<Producto> findByNombreContaining(String texto) {
		return productRepository.findAll();
	}

	@Override
	public String findByNombre(String nombre) {
		return nombre;
	}

	@Override
	public List<Producto> findByPrecioBetween(Integer min, Integer max) {
		return productRepository.findByPrecioBetween( min, max);
	}

	@Override
	public List<Producto> findByNombreAsc() {
		return productRepository.findByOrderByNombreAsc();
	}

	@Override
	public List<Producto> findByNombreDesc() {
		return productRepository.findAll(Sort.by(Sort.Direction.DESC, "Nombre"));
	}

	@Override
	public List<Producto> findByPrecioAsc() {
		return productRepository.findByOrderByPrecioAsc();
	}

	@Override
	public List<Producto> findByPrecioDesc() {
		return productRepository.findByOrderByPrecioDesc();
	}


	
	
	
}
