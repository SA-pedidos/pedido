package br.com.senai.pedido.dto;

import br.com.senai.pedido.model.Pedido;

public class PedidoDto {

	private Integer idPedido;
	private Integer id_cliente;
	private double valor_itens;
	private char status;
	
	public PedidoDto() {
		super();
	}
	public PedidoDto(Integer id, Integer id_cliente, double valor_itens, char status) {
		super();
		this.idPedido = id;
		this.id_cliente = id_cliente;
		this.valor_itens = valor_itens;
		this.status = status;
		
		
		
	}
	
	public PedidoDto(Pedido pedido) {
		this.idPedido = pedido.getId();
		this.id_cliente = pedido.getId_cliente();
		this.valor_itens = pedido.getValor_Itens();
		this.status = pedido.getStatus();
	}
	
	public Integer getId() {
		return idPedido;
	}
	public void setId(Integer id) {
		this.idPedido = id;
	}
	public Integer getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}
	public double getValor_itens() {
		return valor_itens;
	}
	public void setValor_itens(double valor_itens) {
		this.valor_itens = valor_itens;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	
}
