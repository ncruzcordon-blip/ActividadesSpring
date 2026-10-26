package com.example.demo.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="categorias")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	
	@OneToMany(mappedBy="categoria")
	private Set<Producto> productos= new HashSet<>();

	public Categoria() {
		super();
	}

	public Categoria(String nombre, Set<Producto> productos) {
		super();
		this.nombre = nombre;
		this.productos = productos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Producto> getCategoria() {
		return productos;
	}

	public void setCategoria(Set<Producto> productos) {
		this.productos = productos;
	}
	

}
