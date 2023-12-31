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
import br.com.senai.pedido.dto.PedidoDto;
import br.com.senai.pedido.model.Pedido;
import br.com.senai.pedido.service.PedidoService;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

	@Autowired
	private PedidoService pedidoService;
	
	@PostMapping
	public ResponseEntity<PedidoDto> cadastrarPedido(@RequestBody PedidoDto pedidoDto) {
		Pedido pedido = pedidoService.salvarPedido(pedidoDto);
		return ResponseEntity.ok(new PedidoDto(pedido));
	}
	
	@GetMapping
	public ResponseEntity<List<PedidoDto>> listarPedidos(){
		List<Pedido> pedidos = pedidoService.ListarPedidos();
		List<PedidoDto> pedidoDto = pedidos.stream().map(PedidoDto::new).toList();
		return ResponseEntity.ok(pedidoDto);
	}
	
@DeleteMapping("/{id}")
public ResponseEntity<Void> excluirPedido(@PathVariable Integer id) {
	pedidoService.excluirPedido(id);
	return ResponseEntity.status(HttpStatus.OK).build();
}

@PutMapping
public ResponseEntity<PedidoDto> atualizarPedido(@RequestBody PedidoDto pedidoDto) {
	Pedido pedido = pedidoService.salvarPedido(pedidoDto);
	return ResponseEntity.ok(new PedidoDto(pedido));
}

@PostMapping("/criarPedido/{id_cliente}")
public ResponseEntity<PedidoDto> criarPedido(@RequestBody List<ItemDto> ListaItens, @PathVariable Integer id_cliente){
	Pedido pedido = pedidoService.criarPedido(ListaItens, id_cliente);
	return ResponseEntity.ok(new PedidoDto(pedido));
	
	
}
@PostMapping("/Finalizar/{id}")
public ResponseEntity<PedidoDto> FinalizarPedido(@PathVariable Integer id) {
	Pedido pedido = pedidoService.FinalizarPedido(id);
	return ResponseEntity.ok(new PedidoDto(pedido));
}


}
