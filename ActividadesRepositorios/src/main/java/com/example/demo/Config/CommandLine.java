package com.example.demo.Config;

import java.util.HashSet;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.entity.Categoria;
import com.example.demo.entity.Producto;
import com.example.demo.repository.RepositorioCategoria;
import com.example.demo.repository.RepositorioProducto;

@Configuration
public class CommandLine {

	@Bean
	CommandLineRunner productosDeprueba(RepositorioProducto productoR, RepositorioCategoria categoriaR) {
	    return args -> {

	    	Categoria informatica = new Categoria("Informática", new HashSet<>());
	        Categoria accesorios = new Categoria("Accesorios", new HashSet<>());

	        // 2. Guardar primero las categorías en la base de datos
	        categoriaR.save(informatica);
	        categoriaR.save(accesorios);

	        // 3. Crear productos asociándoles las categorías ya guardadas (tampoco se pasa el ID)
	        Producto producto1 = new Producto("Teclado", 50.54, 12, accesorios);
	        Producto producto2 = new Producto("Ratón inalámbrico", 20.04, 2, accesorios);
	        Producto producto3 = new Producto("Pantalla LED", 154.00, 50, informatica);

	        // 4. Guardar los productos
	        productoR.save(producto1);
	        productoR.save(producto2);
	        productoR.save(producto3);
	    };
	}
}
