package br.com.cotiinformatica.interfaces;

import org.springframework.data.repository.CrudRepository;

import br.com.cotiinformatica.entities.Produto;

public interface IProdutoRepository extends CrudRepository<Produto, Integer>{

}
