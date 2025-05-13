package br.com.unicuritiba.Sistema_locacao_automovel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unicuritiba.Sistema_locacao_automovel.models.cliente;

public interface clienterepository 
	extends JpaRepository<cliente, Long> {

}
