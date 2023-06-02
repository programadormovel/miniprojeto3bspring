package br.com.itb.miniprojeto3bspring.control;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.itb.miniprojeto3bspring.model.Produto;
import br.com.itb.miniprojeto3bspring.service.ProdutoService;

@RestController
@CrossOrigin(origins="*", maxAge = 3600,
	allowCredentials = "false")
@RequestMapping("/produto")
public class ProdutoController {
	// Objeto serviço
	final ProdutoService produtoService;
	// Injeção de Dependência
	public ProdutoController(ProdutoService
			_produtoService) {
		super();
		this.produtoService = _produtoService;
	}
	// A rota de pesquisa GET
	@GetMapping
	public ResponseEntity<List<Produto>>
			findAllProdutos(){
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(produtoService.findAll());
	}

}
