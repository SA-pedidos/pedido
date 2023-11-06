package br.com.senai.pedido.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.pedido.dto.PedidoDto;
import br.com.senai.pedido.model.Pedido;
import br.com.senai.pedido.repository.PedidoRepository;

@Service
public class PedidoService {
	
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
}
