package br.com.senai.pedido.model;

import java.util.List;

import br.com.senai.pedido.dto.PedidoDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_pedido;
	private Integer id_cliente;
	private double valor_Itens;
	private char status;
	
	@JoinColumn(name = "pedido_idpedido")
	@OneToMany
	private List<Item> itens;
	
	public Pedido() {
	}
	
	public Pedido(PedidoDto pedidoDto) {
		
		this.id_pedido = pedidoDto.getId();
		this.id_cliente = pedidoDto.getId_cliente();
		this.valor_Itens = pedidoDto.getValor_itens();
		this.status = pedidoDto.getStatus();
	}

	public Pedido(Integer id, Integer id_cliente, double valor_Itens, char status) {
		this.id_pedido = id;
		this.id_cliente = id_cliente;
		this.valor_Itens = valor_Itens;
		this.status = status;
	}

	public Integer getId() {
		return id_pedido;
	}

	public void setId(Integer id) {
		this.id_pedido = id;
	}

	public Integer getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}

	public Double getValor_Itens() {
		return valor_Itens;
	}

	public void setValor_Itens(double valor_Itens) {
		this.valor_Itens = valor_Itens;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}
}
