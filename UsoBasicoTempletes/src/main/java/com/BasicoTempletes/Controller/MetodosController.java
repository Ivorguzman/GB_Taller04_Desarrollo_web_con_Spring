package com.BasicoTempletes.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class MetodosController {

	// Metodo 1
	@GetMapping("/metodo1")
	public String Metodo1() {
		return "vista1"; // Busca laparina en:
	}

	// Metodo 2
	@GetMapping("/metodo2") 
	public ModelAndView Metodo3() {
		return new ModelAndView("vista2");
	}

}
