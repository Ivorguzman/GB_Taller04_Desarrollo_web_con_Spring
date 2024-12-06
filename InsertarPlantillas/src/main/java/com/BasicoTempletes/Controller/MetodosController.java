package com.BasicoTempletes.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class MetodosController {

	// Metodo 1
	// @GetMapping("/metodo1") // Forma ya en deshuso
	@RequestMapping(value = "/metodo1", method = RequestMethod.GET) // Forma ya en deshuso
	public String Metodo1() {
		return "vista1"; // Busca laparina en:
	}

	// Metodo 2
	@GetMapping("/metodo2") // Forma ya en deshuso
	public ModelAndView Metodo3() {
		return new ModelAndView("vista2");
	}

}
