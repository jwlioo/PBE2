package com.senaidev.cadastrolivraria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senaidev.cadastrolivraria.entities.Autor;
import com.senaidev.cadastrolivraria.entities.Cliente;
import com.senaidev.cadastrolivraria.service.AutorService;

@RestController
@RequestMapping("/autores")
public class AutorController {
	@Autowired
    private AutorService autorService;

    @GetMapping
    public List<Autor> buscarAutores() {
        return autorService.buscarAutores();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> buscarEnderecoPorId(@PathVariable Long id){
    Cliente cliente = autorService.buscarAutoresPorId(id);
    
    if (cliente != null) {
    	return ResponseEntity.ok(autor);
    }else {
    	return ResponseEntity.status(404).body("Autor com ID" + id +" não foi encontrado");
    }
    }
    
    @GetMapping("/nome/{nome}")
    public Autor buscarAutorPornome(@PathVariable String nome) {
    	return autorService.buscarAutorPorNome(nome);
    }
    
    @PostMapping
    public Autor criarAutor(@RequestBody Autor autor) {
        return autorService.criarAutorautor);
    }

    @DeleteMapping("/{id}")
    public void excluirAutor(@PathVariable Long id) {
        autorService.excluirAutor(id);
    }
}
