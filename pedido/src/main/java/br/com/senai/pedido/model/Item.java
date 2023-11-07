package br.com.senai.pedido.model;

import br.com.senai.pedido.dto.ItemDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_item;
	private Integer id_produto;
	private Integer quant_prod;
	private double valor_unit;
	private double valor_total;
	
	
	public Item() {
	}
	
	public Item(ItemDto itemDto) {
		super();
		this.id_item = itemDto.getId();
		this.id_produto = itemDto.getId_produto();
		this.quant_prod = itemDto.getQuant_prod();
		this.valor_unit = itemDto.getValor_unit();
		this.valor_total = itemDto.getValor_total();
		
	}
	
	public Item(Integer id, Integer id_produto, Integer quant_prod, Double valor_unit, Double valor_total,
			Integer pedido_idpedido) {
		super();
		this.id_item = id;
		this.id_produto = id_produto;
		this.quant_prod = quant_prod;
		this.valor_unit = valor_unit;
		this.valor_total = valor_total;
		
	}
	public Integer getId() {
		return id_item;
	}
	public void setId(Integer id) {
		this.id_item = id;
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
	
}


