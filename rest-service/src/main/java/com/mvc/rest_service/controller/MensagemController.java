package com.mvc.rest_service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MensagemController {
	
	@GetMapping("/front")
	public String viewTemplate(Model model) {
		model.addAttribute("msg", "Bem-vindo à página do Thymeleaf");
		return "view.html";
	}
	
	@GetMapping("/pagina")
	public String paginaEstatica() {
		return "redirect:/estatica.html";//Redireciona para a página HTML estática
	}
}
