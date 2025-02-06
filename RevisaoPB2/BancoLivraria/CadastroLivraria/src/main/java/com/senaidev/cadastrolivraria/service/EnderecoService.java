package com.senaidev.cadastrolivraria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.cadastrolivraria.entities.Endereco;
import com.senaidev.cadastrolivraria.repository.EnderecoRepository;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    // Listar todos os endereços
    public List<Endereco> buscarEnderecos() {
        return enderecoRepository.findAll();
    }

    // Buscar endereço por ID
    public Endereco buscarEnderecosPorId(Long id) {
        return enderecoRepository.findById(id).orElse(null);
    }

    // Salvar endereço
    public Endereco criarEndereco(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    // Deletar endereço
    public void excluirEndereco(Long id) {
        enderecoRepository.deleteById(id);
    }
}

