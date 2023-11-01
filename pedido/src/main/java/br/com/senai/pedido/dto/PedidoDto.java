package br.com.senai.pedido.dto;

public class PedidoDto {

	private Integer id;
	private Integer id_cliente;
	private double valor_itens;
	private char status;
	
	public PedidoDto() {
		super();
	}
	public PedidoDto(Integer id, Integer id_cliente, double valor_itens, char status) {
		super();
		this.id = id;
		this.id_cliente = id_cliente;
		this.valor_itens = valor_itens;
		this.status = status;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
