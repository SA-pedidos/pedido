package br.com.senai.pedido.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.pedido.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
