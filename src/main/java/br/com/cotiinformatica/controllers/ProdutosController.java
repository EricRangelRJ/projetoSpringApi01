package br.com.cotiinformatica.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProdutosController {
	
	// atributo para armazenar o endereço do serviço
		private static final String ENDPOINT = "/api/produtos";

		// método para cadastrar produtos
		@RequestMapping(value = ENDPOINT, method = RequestMethod.POST)
		public ResponseEntity<String> post() {
			// TODO
			return ResponseEntity.status(HttpStatus.OK).body("Cadastro de produto executado com sucesso!");
		}

		// método para atualizar produtos
		@RequestMapping(value = ENDPOINT, method = RequestMethod.PUT)
		public ResponseEntity<String>put() {
			// TODO
			return ResponseEntity.status(HttpStatus.OK).body("Atualização de produto executado com sucesso!");
		}

		// método para excluir produtos
		@RequestMapping(value = ENDPOINT, method = RequestMethod.DELETE)
		public ResponseEntity<String> delete() {
			// TODO
			return ResponseEntity.status(HttpStatus.OK).body("Exclusão de produto executado com sucesso!");
		}

		// método para consultar produtos
		@RequestMapping(value = ENDPOINT, method = RequestMethod.GET)
		public ResponseEntity<String>get() {
			// TODO
			return ResponseEntity.status(HttpStatus.OK).body("Consulta de produto executado com sucesso!");
		}


}
