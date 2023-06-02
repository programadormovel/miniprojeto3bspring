package br.com.itb.miniprojeto3bspring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.itb.miniprojeto3bspring.model.Produto;
import br.com.itb.miniprojeto3bspring.model.ProdutoRepository;

@Service
public class ProdutoService {
	
	//Criar objeto repositório
	final ProdutoRepository produtoRepository;
	// Definir Injeção de Dependência
	public ProdutoService(
			ProdutoRepository _produtoRepository) {
		this.produtoRepository = _produtoRepository;
	}
	
	// Insert Into Produto
	
	// Select * from produto
	public List<Produto> findAll(){
		return produtoRepository.findAll();
	}
	
	
	
	
	
	
	
}




