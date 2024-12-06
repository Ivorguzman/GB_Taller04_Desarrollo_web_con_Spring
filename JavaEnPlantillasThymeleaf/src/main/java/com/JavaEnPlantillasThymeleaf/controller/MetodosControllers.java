package com.JavaEnPlantillasThymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class MetodosControllers {
	
	// Metodo2 (Usando la Anotaciones @RequestMapping(...)==> no se usa ya,se usa @GetMapping("/....") )
	// @RequestMapping(value = "/metodo1", method = RequestMethod.GET)// [EN DESUSOS]
	@GetMapping("/metodo1")
	public String Metodo1(Model modelo) {
		modelo.addAttribute("atributoNombreVista1", "Ivor");
		return "vista1";
	}
	
	


	// Metodo2 (Usando la clase ModelAndView)
	@GetMapping("/metodo2")
	public ModelAndView Metodo2() {
		ModelAndView modeloVistaControlador = new ModelAndView("vista2.html");
		modeloVistaControlador.addObject("atributoNombreVista2", "Alexander");
		return modeloVistaControlador;
	}
	

}














