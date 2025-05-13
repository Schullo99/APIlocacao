package br.com.unicuritiba.Sistema_locacao_automovel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.unicuritiba.Sistema_locacao_automovel.models.locacao;
import br.com.unicuritiba.Sistema_locacao_automovel.repositories.locacaorepository;


@RestController
public class locacaocontroller {
	
	@Autowired
	locacaorepository repository;
	
	@GetMapping("/locacoes")
	public ResponseEntity<List<locacao>> getLocacoes(){
		return ResponseEntity.ok(repository.findAll());	
	}
	@GetMapping("/locacoes/{id}")
	public ResponseEntity<locacao> getLocacao(@PathVariable long id){
		return ResponseEntity.ok(repository.findById(id).get());		
	}
	@PostMapping("/locacoes")
	public ResponseEntity<locacao> saveLocacao(
			@RequestBody locacao locacao){
		locacao savedLocacao = repository.save(locacao);
		return ResponseEntity.ok(savedLocacao);
	}
	
	@DeleteMapping("/locacoes/{id}")
	public void removelocacao(@PathVariable long id) {
		 repository.deleteById(id);
	}
	@PutMapping("/movies/{id}")
	public ResponseEntity<locacao> updateMovie(@PathVariable long id,
			@RequestBody locacao locacao) {
		locacao.setId(id);
		locacao savedLocacao = repository.save(locacao);
		return ResponseEntity.ok(savedLocacao);

	}
	
}
