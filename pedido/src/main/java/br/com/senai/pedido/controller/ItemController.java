package br.com.senai.pedido.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.pedido.dto.ItemDto;
import br.com.senai.pedido.model.Item;
import br.com.senai.pedido.service.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {

	@Autowired
	private ItemService itemService;

	@PostMapping
	public ResponseEntity<ItemDto> cadastrarItem(@RequestBody ItemDto itemDto) {
		Item item = itemService.salvarItens(itemDto);
		return ResponseEntity.ok(new ItemDto(item));
	}

	@GetMapping
	public ResponseEntity<List<ItemDto>> ListarItens() {
		List<Item> item = itemService.ListarItens();
		List<ItemDto> itemDto = item.stream().map(ItemDto::new).toList();
		return ResponseEntity.ok(itemDto);
	}
@DeleteMapping("/{id}")
public ResponseEntity<Void> excluirItens(@PathVariable Integer id){
itemService.excluirItens(id);
return ResponseEntity.status(HttpStatus.OK).build();
	}

@PutMapping
public ResponseEntity<ItemDto> atualizarItem(@RequestBody ItemDto itemDto){ 
Item item = itemService.salvarItens(itemDto);
return ResponseEntity.ok(new ItemDto(item));
}
}
