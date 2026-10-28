package com.example.demo.Config;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.entity.Categoria;
import com.example.demo.entity.Producto;
import com.example.demo.repository.RepositorioCategoria;
import com.example.demo.repository.RepositorioProducto;
import com.example.demo.services.ProductService;

@Configuration
public class CommandLine {
	
	@Autowired
	@Qualifier("productService")
	private ProductService productService;
	
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
	        System.out.println("GUARDAR PRODUCTOS CON SERVICES");
	        productService.addProduct(producto1);
	        productService.addProduct(producto2);
	        productService.addProduct(producto3);
	        
	        System.out.println("\nLISTAR PRODUCTOS CON SERVICES");
	        for(Producto p: productService.listAllProducts()) {
	        	System.out.println(p.toString());
	        }
	        
	        System.out.println("BUSCAR PRODUCTO CON SERVICES");
	        productService.findById(producto1.getId());
	        
	        System.out.println("ELIMINAR PRODUCTOS CON SERVICES");
	        productService.removeProduct(producto2.getId());
	        
	        System.out.println("ACTUALIZAR PRODUCTOS CON SERVICES");
	        producto1.setNombre("Teclado nuevo");
	        productService.updateProduct(producto1);

	        
	        System.out.println("\nLISTAR PRODUCTOS CON SERVICES");
	        for(Producto p: productService.listAllProducts()) {
	        	System.out.println(p.toString());
	        }
	    };
	}
}
