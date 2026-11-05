package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Categoria;
import com.example.demo.entity.Producto;
import com.example.demo.services.CategoriaService;
import com.example.demo.services.ProductService;

@Controller
@RequestMapping("/producto")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CategoriaService categoriaService;
		
	
	//METODO GET --> vista de tabla de productos
	
	private static final String PRINCIPAL_PANEL="list_product";
	
	@GetMapping("/vistaPrincipal")
	public ModelAndView vistaProductos() {
		ModelAndView mav= new ModelAndView(PRINCIPAL_PANEL);
		List<Producto> productos = productService.listAllProducts();
		mav.addObject("productos", productos);
		return mav;
	}
	
	//METODO GET --> Nuevo producto
		@GetMapping("/nuevo")
		public ModelAndView nuevoProducto() {
			ModelAndView mav = new ModelAndView(EDITION_PANEL);
			mav.addObject("producto", new Producto());
			mav.addObject("categorias", categoriaService.getAllCategorias());
			return mav;
		}
	
	//METODO GET --> vista de edición de productos
	
	private static final String EDITION_PANEL="form_product";
	@GetMapping("/editar")
	public ModelAndView editar(@RequestParam(name="id") int id) {
		ModelAndView mav = new ModelAndView(EDITION_PANEL);
		Producto producto = productService.findById(id);
		mav.addObject("producto", producto);
		mav.addObject("categorias", categoriaService.getAllCategorias());
		return mav;
	}
	
	//METODO POST --> envío de datos editados
	@PostMapping("/updateOrSaveProduct")
	public String registro(@ModelAttribute("producto") Producto producto) {
		if(producto.getId()==0) {
			productService.addProduct(producto);
		}else {
			productService.updateProduct(producto);
		}
		return "redirect:/producto/vistaPrincipal";
	}
	
	//METODO POST --> eliminar
	@PostMapping("/eliminar")
	public String eliminar(@RequestParam("id") int id) {
		productService.removeProduct(id);
		return "redirect:/producto/vistaPrincipal";
	}


}
