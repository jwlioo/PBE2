package com.senaidev.cadastrolivraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senaidev.cadastrolivraria.entities.Cliente;

@Repository
public interface ClientesRepository extends JpaRepository<Cliente, Long>{
	Cliente findByCpf(String cpf);
}