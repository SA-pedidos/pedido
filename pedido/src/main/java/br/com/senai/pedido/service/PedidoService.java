package br.com.senai.pedido.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.pedido.client.EntregaClient;
import br.com.senai.pedido.dto.EntregaDto;
import br.com.senai.pedido.dto.ItemDto;
import br.com.senai.pedido.dto.PedidoDto;
import br.com.senai.pedido.model.Item;
import br.com.senai.pedido.model.Pedido;
import br.com.senai.pedido.repository.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private EntregaClient entregaClient;
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	public Pedido salvarPedido(PedidoDto pedidoDto) {
		Pedido pedido = new Pedido(pedidoDto);
		return pedidoRepository.save(pedido);
	}
	
	public List<Pedido> ListarPedidos(){
	return pedidoRepository.findAll();
	}

	public void excluirPedido(Integer id) {
		pedidoRepository.deleteById(id);
	}
	public Pedido criarPedido(List<ItemDto> ListaItens, Integer id_cliente) {
		
		Pedido pedido = new Pedido();
		
		List<Item> ListaItem = ListaItens.stream().map(Item::new).toList();
		double cont = 0;
		for (Item item : ListaItem) {
			cont+= item.getValor_total();
		}
		pedido.setValor_Itens(cont);
		pedido.setId_cliente(id_cliente);
		pedido.setStatus('A');
		pedido.setItens(ListaItem);
		return pedidoRepository.save(pedido);
	}
	
public Pedido FinalizarPedido(Integer id) {
	Optional<Pedido> pedido = pedidoRepository.findById(id);
	if(pedido.isPresent()) {
		pedido.get().setStatus(Pedido.Finalizado);
		EntregaDto entregaDto = new EntregaDto();
		entregaDto.setPedidoId(id);
		entregaDto.setPrazo(LocalDateTime.now());
		entregaClient.CriarEntrega(entregaDto);
		return pedidoRepository.save(pedido.get());
	}
	return null;
}
	
}
