package br.com.senai.pedido.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.pedido.dto.ItemDto;
import br.com.senai.pedido.model.Item;
import br.com.senai.pedido.repository.ItemRepository;

@Service
public class ItemService {
	
	@Autowired
	private ItemRepository itemRepository;
	
	public Item salvarItens(ItemDto itensDto) {
		Item itens = new Item(itensDto);
		return itemRepository.save(itens);
	}
	
	public List<Item> ListarItens(){
		return itemRepository.findAll();
	}

	public void excluirItens(Integer id) {
		itemRepository.deleteById(id);
	}
	
}
