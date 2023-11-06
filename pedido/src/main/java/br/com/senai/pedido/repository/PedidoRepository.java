package br.com.senai.pedido.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import br.com.senai.pedido.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer>{
	
	
}
