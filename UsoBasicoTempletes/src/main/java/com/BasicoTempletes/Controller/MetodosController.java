package com.BasicoTempletes.Controller; // Paquete que contiene la clase MetodosController

import org.springframework.stereotype.Controller; // Importa la anotación @Controller de Spring
import org.springframework.web.bind.annotation.GetMapping; // Importa la anotación @GetMapping de Spring
import org.springframework.web.bind.annotation.RequestMapping; // Importa la anotación @RequestMapping de Spring
import org.springframework.web.servlet.ModelAndView; // Importa la clase ModelAndView de Spring

@Controller // Indica que esta clase es un controlador de Spring MVC
@RequestMapping("/") // Mapea todas las rutas dentro de esta clase al contexto raíz
public class MetodosController {

	// Metodo 1
	@GetMapping("/metodo1") // Mapea solicitudes GET a /metodo1
	public String Metodo1() {
		return "vista1"; // Retorna el nombre de la vista "vista1"
	}

	// Metodo 2
	@GetMapping("/metodo2") // Mapea solicitudes GET a /metodo2
	public ModelAndView Metodo3() {
		return new ModelAndView("vista2"); // Retorna una nueva instancia de ModelAndView para la vista "vista2"
	}

	/*
	 * 
	 * Explicación a nivel de bloque y flujo de ejecución:
	 * Paquete y importaciones:
	 * 
	 * package com.BasicoTempletes.Controller;: Define el paquete donde reside la clase MetodosController.
	 * 
	 * Importaciones: Incluyen las clases y anotaciones necesarias de Spring Framework para manejar las solicitudes GET y devolver vistas.
	 * 
	 * 
	 * 
	 * Anotaciones de la clase:
	 * 
	 * @Controller: Marca la clase como un controlador de Spring MVC, permitiendo manejar solicitudes HTTP y devolver vistas.
	 * 
	 * @RequestMapping("/"): Define que todas las rutas manejadas por esta clase comiencen desde el contexto raíz (/).
	 * 
	 * 
	 * 
	 * Métodos para manejar solicitudes:
	 * 
	 * Metodo1:
	 * 
	 * @GetMapping("/metodo1"): Mapea solicitudes GET a la ruta /metodo1.
	 * 
	 * public String Metodo1(): Método que maneja la solicitud GET a /metodo1.
	 * 
	 * return "vista1";: Retorna el nombre de la vista vista1, que será resuelta por el ViewResolver.
	 * 
	 * Metodo2:
	 * 
	 * @GetMapping("/metodo2"): Mapea solicitudes GET a la ruta /metodo2.
	 * 
	 * public ModelAndView Metodo3(): Método que maneja la solicitud GET a /metodo2.
	 * 
	 * return new ModelAndView("vista2");: Retorna una nueva instancia de ModelAndView con la vista vista2.
	 * 
	 * 
	 * 
	 * 
	 * Flujo de ejecución:
	 * Recepción de solicitudes:
	 * 
	 * Cuando se recibe una solicitud GET a la ruta /metodo1, se llama al método Metodo1.
	 * 
	 * Cuando se recibe una solicitud GET a la ruta /metodo2, se llama al método Metodo3.
	 * 
	 * Procesamiento de la solicitud:
	 * 
	 * Metodo1: Retorna el nombre de la vista vista1, que será resuelta por el ViewResolver.
	 * 
	 * Metodo3: Crea una nueva instancia de ModelAndView con la vista vista2 y la retorna.
	 * 
	 * Resolución y renderización de la vista:
	 * 
	 * El DispatcherServlet de Spring utiliza el ViewResolver para determinar y renderizar la vista apropiada basada en los nombres devueltos por los métodos.
	 */


}
