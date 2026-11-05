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
	
	/*@Autowired
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
	        Producto producto4 = new Producto("Teclados", 150.54, 2, accesorios);
	        Producto producto5 = new Producto("Teclas", 3.14, 32, accesorios);
	        
	        // 4. Guardar los productos
	        System.out.println("GUARDAR PRODUCTOS CON SERVICES");
	        productService.addProduct(producto1);
	        productService.addProduct(producto2);
	        productService.addProduct(producto3);
	        productService.addProduct(producto4);
	        productService.addProduct(producto5);
	        
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
	        
	        //SELECT * FROM productos WHERE nombre="Teclados";
	        System.out.println("\nLISTAR PRODUCTOS CON NOMBRE");
	        for(Producto p: productService.listAllProducts()) {
	        	String nombreRecuperado = productService.findByNombre("Teclados");
	        	if(p.getNombre().equalsIgnoreCase(nombreRecuperado)){
	        		System.out.println(p.toString());
	        	}
	        }
	        
	        //SELECT * FROM productos WHERE nombre LIKE %Tecla%;
	        System.out.println("\nLISTAR PRODUCTOS CON NOMBRE PARCIAL");
	        for(Producto p: productService.findByNombreContaining("Tecla")) {
	        	System.out.println(p.toString());
	        }
	        
	        //SELECT * FROM productos WHERE precio BETWEEN 4 AND 154;
	        System.out.println("\nINTERVALO DE PRECIO");
	        for(Producto p: productService.findByPrecioBetween(4, 154)) {
	        	System.out.println(p.toString());
	        }
	        
	        //SELECT * FROM productos ORDER BY nombre ASC;
	        System.out.println("\nORDENAR PRODUCTOS POR NOMBRE ASCENDENTE");
	        for(Producto p: productService.findByNombreAsc()) {
	        	System.out.println(p.toString());
	        }
	        
	        //SELECT * FROM productos ORDER BY nombre DESC;
	        System.out.println("\nORDENAR PRODUCTOS POR NOMBRE DESCENDENTE");
	        for(Producto p: productService.findByNombreDesc()) {
	        	System.out.println(p.toString());
	        }
	        
	        //SELECT * FROM productos ORDER BY precio ASC;
	        System.out.println("\nORDENAR PRODUCTOS POR PRECIO ASCENDENTE");
	        for(Producto p: productService.findByPrecioAsc()) {
	        	System.out.println(p.toString());
	        }
	        
	      //SELECT * FROM productos ORDER BY precio DESC;
	        System.out.println("\nORDENAR PRODUCTOS POR PRECIO DESCENDENTE");
	        for(Producto p: productService.findByPrecioDesc()) {
	        	System.out.println(p.toString());
	        }
	        
	        //SELECT * FROM productos WHERE categoria.nombre = "Informática"
	        System.out.println("\nORDENAR PRODUCTOS POR NOMBRE DE CATEGORIA");
	        for(Producto p: productService.findByCategoriaNombre("Informática")) {
	        		System.out.println(p.toString());
	        	
	        }
	    };
	}*/
}
