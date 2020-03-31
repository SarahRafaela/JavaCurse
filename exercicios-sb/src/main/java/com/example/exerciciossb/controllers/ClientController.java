package com.example.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.exerciciossb.modells.Cliente;

@RestController
//url dessa classe sempre antecede as urls dos métodos
@RequestMapping(path = "/clientes")
public class ClientController {

	@GetMapping(path = "/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28, "Pedro", "123.456.789");
	}

	@GetMapping("/{id}")
	public Cliente obterClienteporID1(@PathVariable int id) {
		return new Cliente(id, "Maria", "987.654.321-00");
	}

	@GetMapping
	public Cliente obterClienteporID2(@RequestParam(name = "id") int id) {
		return new Cliente(id, "Sarah", "333.333.333-33");
	}
}
