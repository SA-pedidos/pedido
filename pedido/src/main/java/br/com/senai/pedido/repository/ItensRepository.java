package br.com.senai.pedido.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.pedido.model.Itens;

public interface ItensRepository extends JpaRepository<Itens, Integer>{

}
