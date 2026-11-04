package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Producto;

@Repository
public interface RepositorioProducto extends JpaRepository<Producto, Integer> {

	List<Producto> findByPrecioBetween(Integer min, Integer max);
	List<Producto> findByOrderByNombreAsc();
	//List<Producto> findByOrderByNombreDesc();
	List<Producto> findByOrderByPrecioDesc();
	List<Producto> findByOrderByPrecioAsc();
}
