package br.com.unicuritiba.Sistema_locacao_automovel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unicuritiba.Sistema_locacao_automovel.models.locacao;

public interface locacaorepository 
	extends JpaRepository<locacao, Long>{

}
