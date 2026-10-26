package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Categoria;


@Repository
public interface RepositorioCategoria extends JpaRepository<Categoria, Integer> {

}

