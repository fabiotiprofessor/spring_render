package com.mvc.rest_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mvc.rest_service.model.Mensagem;

@RestController
@RequestMapping("/api")
public class MensagemRestController {
	
	@GetMapping("/mensagem")
	public Mensagem obterMensagem() {
		return new Mensagem("Olá, este é um retorno em JSON");
	}
}
