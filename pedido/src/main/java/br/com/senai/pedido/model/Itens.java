package br.com.senai.pedido.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Itens {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer id_produto;
	private Integer quant_prod;
	private Double valor_unit;
	private Double valor_total;
	private Integer pedido_idpedido;
	
	public Itens() {
	}
	
	public Itens(ItensDto itensDto) {
		super();
		this.id = itensDto.getId();
		this.id_produto = itensDto.getId_Produto();
		this.quant_prod = itensDto.getQuant_Prod();
		this.valor_unit = itensDto.getValor_Unit();
		this.valor_total = itensDto.getValor_Total();
		this.pedido_idpedido = itensDto.getPedido_Idpedido();
	}
	
	public Itens(Integer id, Integer id_produto, Integer quant_prod, Double valor_unit, Double valor_total,
			Integer pedido_idpedido) {
		super();
		this.id = id;
		this.id_produto = id_produto;
		this.quant_prod = quant_prod;
		this.valor_unit = valor_unit;
		this.valor_total = valor_total;
		this.pedido_idpedido = pedido_idpedido;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId_produto() {
		return id_produto;
	}
	public void setId_produto(Integer id_produto) {
		this.id_produto = id_produto;
	}
	public Integer getQuant_prod() {
		return quant_prod;
	}
	public void setQuant_prod(Integer quant_prod) {
		this.quant_prod = quant_prod;
	}
	public Double getValor_unit() {
		return valor_unit;
	}
	public void setValor_unit(Double valor_unit) {
		this.valor_unit = valor_unit;
	}
	public Double getValor_total() {
		return valor_total;
	}
	public void setValor_total(Double valor_total) {
		this.valor_total = valor_total;
	}
	public Integer getPedido_idpedido() {
		return pedido_idpedido;
	}
	public void setPedido_idpedido(Integer pedido_idpedido) {
		this.pedido_idpedido = pedido_idpedido;
	}
}

