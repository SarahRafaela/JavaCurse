package com.example.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

	// /calculadora/somar/10/20
	@GetMapping("/somar/{x}/{y}")
	public int somar(@PathVariable int x, @PathVariable int y) {
		return x + y;
	}

	// /calculadora/subtrair?=100&b=39
	@GetMapping("/subtrair")
	public int subtrair(@RequestParam(name = "x") int x,@RequestParam(name = "y") int y) {
		return x - y;
	}

}
