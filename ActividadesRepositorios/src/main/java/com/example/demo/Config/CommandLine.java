package com.example.demo.Config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.entity.Producto;
import com.example.demo.repository.RepositorioProducto;

@Configuration
public class CommandLine {

	@Bean
	CommandLineRunner productosDeprueba(RepositorioProducto productoR) {
		return args -> {
			Producto producto1 = new Producto("Teclado", 50.54, 12);
			Producto producto2 = new Producto("Ratón inalámbrico", 20.04, 2);
			Producto producto3 = new Producto("Pantalla LED", 154.00, 50);
			
			productoR.save(producto1);
			productoR.save(producto2);
			productoR.save(producto3);
			
			System.out.println("Productos guardados con éxito.");
		};
		
	}
}
