package br.com.senai.pedido.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.senai.pedido.dto.EntregaDto;

@FeignClient("/entrega")
public interface EntregaClient {

	@PostMapping("/entrega")
	public void CriarEntrega(EntregaDto entregaDto);
	

}
