package com.BasicoTempletes.Controller; // Paquete que contiene la clase MetodosController

import org.springframework.stereotype.Controller; // Importa la anotación @Controller
import org.springframework.web.bind.annotation.GetMapping; // Importa la anotación @GetMapping
import org.springframework.web.bind.annotation.RequestMapping; // Importa la anotación @RequestMapping
import org.springframework.web.bind.annotation.RequestMethod; // Importa la enumeración RequestMethod
import org.springframework.web.servlet.ModelAndView; // Importa la clase ModelAndView

@Controller // Indica que esta clase es un controlador de Spring MVC
@RequestMapping("/") // Mapea todas las rutas dentro de esta clase al contexto raíz
public class MetodosController {

	// Metodo 1
	// @GetMapping("/metodo1") // Mapea solicitudes GET a /metodo1
	@RequestMapping(value = "/metodo1", method = RequestMethod.GET) // Mapea solicitudes GET a /metodo1 (Forma ya en desuso)
	public String Metodo1() {
		return "vista1"; // Devuelve el nombre de la vista "vista1"
	}

	// Metodo 2
	@GetMapping("/metodo2") // Mapea solicitudes GET a /metodo2
	public ModelAndView Metodo3() {
		return new ModelAndView("vista2"); // Devuelve una nueva instancia de ModelAndView para la vista "vista2"
	}


	/*
	 * Explicación y flujo de ejecución:
	 * Paquete y importaciones:
	 * 
	 * package com.BasicoTempletes.Controller;: Define el paquete donde se encuentra la clase.
	 * 
	 * Importaciones: Importa las clases y anotaciones necesarias de Spring Framework.
	 * 
	 * 
	 * Anotaciones de la clase:
	 * 
	 * @Controller: Marca la clase como un controlador de Spring MVC.
	 * 
	 * @RequestMapping("/"): Define el contexto raíz para todas las rutas mapeadas en esta clase.
	 * 
	 * 
	 * 
	 * Método 1 (Metodo1):
	 * 
	 * @RequestMapping(value = "/metodo1", method = RequestMethod.GET): Mapea solicitudes GET a la ruta /metodo1.
	 * 
	 * public String Metodo1(): Define un método que maneja solicitudes GET a /metodo1.
	 * 
	 * return "vista1";: Retorna el nombre de la vista vista1.
	 * 
	 * 
	 * 
	 * Método 2 (Metodo3):
	 * 
	 * @GetMapping("/metodo2"): Mapea solicitudes GET a la ruta /metodo2.
	 * 
	 * public ModelAndView Metodo3(): Define un método que maneja solicitudes GET a /metodo2.
	 * 
	 * return new ModelAndView("vista2");: Retorna una nueva instancia de ModelAndView para la vista vista2.
	 * 
	 * 
	 * 
	 * Flujo de ejecución:
	 * Cuando se recibe una solicitud GET a la ruta /metodo1, el método Metodo1 maneja la solicitud y devuelve el nombre de la vista vista1.
	 * 
	 * Cuando se recibe una solicitud GET a la ruta /metodo2, el método Metodo3 maneja la solicitud y devuelve una nueva instancia de ModelAndView para la vista vista2.
	 */
}
