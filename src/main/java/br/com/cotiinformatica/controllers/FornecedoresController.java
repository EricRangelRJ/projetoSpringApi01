package br.com.cotiinformatica.controllers;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.cotiinformatica.dtos.FornecedorPostDTO;
import br.com.cotiinformatica.entities.Fornecedor;
import br.com.cotiinformatica.interfaces.IFornecedorRepository;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@Controller
@Transactional //necessário por conta do repositório @AutoWired do hibernate
public class FornecedoresController {

	//inicialização do repositório
	@Autowired
	private IFornecedorRepository fornecedorRepository;
	
	// atributo para armazenar o endereço do serviço
	private static final String ENDPOINT = "/api/fornecedores";

	
	
	// método para cadastrar fornecedor
	@RequestMapping(value = ENDPOINT, method = RequestMethod.POST)
	public ResponseEntity<String> post(@RequestBody FornecedorPostDTO dto) {
		
		try {
			
			
			//regastar os dados do DTO e transferi-los para a entidade
			Fornecedor fornecedor = new Fornecedor();
			fornecedor.setNome(dto.getNome());
			fornecedor.setCnpj(dto.getCnpj());
			
			//gravar no banco de dados
			
			fornecedorRepository.save(fornecedor);
			
			return ResponseEntity
					.status(HttpStatus.OK)
					.body("Cadastrado com Sucesso!");
			
			
			
		} catch (Exception e) {
			return ResponseEntity
					.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Erro: " + e.getMessage());

		}
		
		
		
	}
	
	
	
	
	
	
	// método para atualizar fornecedor
		@RequestMapping(value = ENDPOINT, method = RequestMethod.PUT)
		public ResponseEntity<String> put() {
			// TODO
			return ResponseEntity.status(HttpStatus.OK).body("Fornecedor atualizado com sucesso!");

		}
		
		// método para excluir fornecedor
				@RequestMapping(value = ENDPOINT, method = RequestMethod.DELETE)
				public ResponseEntity<String> delete() {
					// TODO
					return ResponseEntity.status(HttpStatus.OK).body("Fornecedor deletado com sucesso!");

				}
				
				// método para consultar fornecedor
				@RequestMapping(value = ENDPOINT, method = RequestMethod.GET)
				public ResponseEntity<String> get() {
					// TODO
					return ResponseEntity.status(HttpStatus.OK).body("Colsulta de fornecedor executado com sucesso!");

				}
}

