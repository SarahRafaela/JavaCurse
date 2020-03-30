package com.example.exerciciossb.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

	// mapear requisição para esse método
	// path se eu colocar /ola ou /saudacao na url ele retorna esse metodo
	// outra alternativa é o @GetMapping(path = "/ola")
	@RequestMapping(method = RequestMethod.GET, path = { "/ola", "/saudacao" })
	public String Ola() {
		return "Ola Spring Boot";
	}

}
