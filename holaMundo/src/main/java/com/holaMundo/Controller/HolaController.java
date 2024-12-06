package com.holaMundo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller// Indicando que esta clase es un controlador
@RequestMapping("/") // Indica la url para cargar la clase
public class HolaController {

	// @RequestMapping("/home") // Para indicar ruta(path) a nivel de metodo [ en desuso ]
	// @GetMapping("/") // Para indicar ruta(path) a nivel de metodo
	@GetMapping("/home") // Para indicar ruta(path) a nivel de metodo
	public String home() {
		return "holaMundo";
		// return "saludos";


	}

}
