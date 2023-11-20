package br.com.senai.pedido.dto;

import java.time.LocalDateTime;

public class EntregaDto {
	private Integer id;
	private Integer pedidoId;
	private LocalDateTime prazo;
	
	public EntregaDto() {
		super();
	}
	
	public EntregaDto(Integer id, Integer pedidoId, LocalDateTime prazo) {
		this.id = id;
		this.pedidoId = pedidoId;
		this.prazo = prazo;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPedidoId() {
		return pedidoId;
	}
	public void setPedidoId(Integer pedidoId) {
		this.pedidoId = pedidoId;
	}
	public LocalDateTime getPrazo() {
		return prazo;
	}
	public void setPrazo(LocalDateTime prazo) {
		this.prazo = prazo;
	}
	
	
}
