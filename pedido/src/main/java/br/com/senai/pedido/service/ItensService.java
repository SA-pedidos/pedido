package br.com.senai.pedido.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.pedido.dto.ItensDto;
import br.com.senai.pedido.model.Itens;
import br.com.senai.pedido.repository.ItensRepository;

@Service
public class ItensService {
	
	@Autowired
	private ItensRepository itensRepository;
	
	public Itens salvarItens(ItensDto itensDto) {
		Itens itens = new Itens(itensDto);
		return itensRepository.save(itens);
	}
	
	public List<Itens> ListarItens(){
		return itensRepository.findAll();
	}

	public void excluirItens(Integer id) {
		itensRepository.deleteById(id);
	}
	
}
