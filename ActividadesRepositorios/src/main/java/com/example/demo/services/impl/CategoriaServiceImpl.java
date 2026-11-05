package com.example.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Categoria;
import com.example.demo.repository.RepositorioCategoria;
import com.example.demo.services.CategoriaService;

@Service("categoriaService")
public class CategoriaServiceImpl implements CategoriaService{
	
	@Autowired
	private RepositorioCategoria categoriaRepository;

	@Override
	public List<Categoria> getAllCategorias() {
		return categoriaRepository.findAll();
	}
	

}
