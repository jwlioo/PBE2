package com.senaidev.cadastrolivraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senaidev.cadastrolivraria.entities.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long>{
	Autor findBynome(String nome);

}
