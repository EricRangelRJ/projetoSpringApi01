package br.com.cotiinformatica.interfaces;

import org.springframework.data.repository.CrudRepository;

import br.com.cotiinformatica.entities.Fornecedor;

public interface IFornecedorRepository extends CrudRepository<Fornecedor, Integer> {

}
