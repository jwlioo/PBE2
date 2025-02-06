package com.senaidev.cadastrolivraria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.cadastrolivraria.entities.Autor;
import com.senaidev.cadastrolivraria.repository.AutorRepository;

@Service
public class AutorService {
	@Autowired
    private AutorRepository autorRepository;

    // Listar todos os endereços
    public List<Autor> buscarAutores() {
        return autorRepository.findAll();
    }

    // Buscar endereço por ID
    public Autor buscarAutoresPorId(Long id) {
        return autorRepository.findById(id).orElse(null);
    }

    // Salvar endereço
    public Autor criarAutor(Autor autor) {
        return autorRepository.save(autor);
    }

    // Deletar endereço
    public void excluirAutor(Long id) {
        autorRepository.deleteById(id);
    }
}

