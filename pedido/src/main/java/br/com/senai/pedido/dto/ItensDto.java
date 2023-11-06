package br.com.senai.pedido.dto;

import br.com.senai.pedido.model.Itens;

public class ItensDto {

	private Integer id;
	private Integer id_produto;
	private Integer quant_prod;
	private double valor_unit;
	private double valor_total;

	public ItensDto() {
		super();
	}

	public ItensDto(Integer id, Integer id_produto, Integer quant_prod, double valor_unit, double valor_total) {
		super();
		this.id = id;
		this.id_produto = id_produto;
		this.quant_prod = quant_prod;
		this.valor_unit = valor_unit;
		this.valor_total = valor_total;
	}

	public ItensDto(Itens itens) {
		super();
		this.id = itens.getId();
		this.id_produto = itens.getId_produto();
		this.quant_prod = itens.getQuant_prod();
		this.valor_unit = itens.getValor_unit();
		this.valor_total = itens.getValor_total();
	
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

	public double getValor_unit() {
		return valor_unit;
	}

	public void setValor_unit(double valor_unit) {
		this.valor_unit = valor_unit;
	}

	public double getValor_total() {
		return valor_total;
	}

	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}

}
