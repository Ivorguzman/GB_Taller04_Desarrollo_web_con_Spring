package com.JavaEnPlantillasThymeleaf.controller; // Paquete que contiene la clase MetodosControllers

import org.springframework.stereotype.Controller; // Importa la anotación @Controller de Spring
import org.springframework.ui.Model; // Importa la interfaz Model de Spring
import org.springframework.web.bind.annotation.GetMapping; // Importa la anotación @GetMapping de Spring
import org.springframework.web.bind.annotation.RequestMapping; // Importa la anotación @RequestMapping de Spring
import org.springframework.web.servlet.ModelAndView; // Importa la clase ModelAndView de Spring

@Controller // Indica que esta clase es un controlador de Spring MVC
@RequestMapping("/") // Mapea todas las rutas dentro de esta clase al contexto raíz
public class MetodosControllers {

	// Metodo1 (Usando la clase Interface Model como parametro del metodo a utilizar (public String Metodo1))
	@GetMapping("/metodo1") // Mapea solicitudes GET a /metodo1
	public String Metodo1(Model modelo) {
		modelo.addAttribute("atributoNombreVista1", "Ivor"); // Añade un atributo al modelo
		return "vista1"; // Devuelve el nombre de la vista "vista1"
	}

	// Metodo2 (Usando instancia de la clase Ordinaria ModelAndView)
	@GetMapping("/metodo2") // Mapea solicitudes GET a /metodo2
	public ModelAndView Metodo2() {
		ModelAndView modelo = new ModelAndView("vista2.html"); // Crea una nueva instancia de ModelAndView con la vista "vista2.html"
		modelo.addObject("atributoNombreVista2", "Alexander"); // Añade un objeto al modelo
		return modelo; // Devuelve la instancia de ModelAndView
	}

}
/*
 * 
 * Explicación a nivel de bloque y flujo de ejecución:
 * Paquete y importaciones:
 * 
 * package com.JavaEnPlantillasThymeleaf.controller;: Define el paquete donde reside la clase MetodosControllers.
 * 
 * Importaciones: Incluyen clases y anotaciones necesarias de Spring Framework para manejar las solicitudes web y devolver vistas.
 * 
 * 
 * 
 * Anotaciones de la clase:
 * 
 * @Controller: Marca la clase como un controlador de Spring MVC, lo que permite manejar solicitudes HTTP y devolver vistas.
 * 
 * @RequestMapping("/"): Define que todas las rutas manejadas por esta clase comiencen desde el contexto raíz (/).
 * 
 * 
 * 
 * Método 1 (Metodo1):
 * 
 * @GetMapping("/metodo1"): Mapea solicitudes GET a la ruta /metodo1.
 * 
 * public String Metodo1(Model modelo): Método que maneja la solicitud GET a /metodo1 y utiliza un parámetro de tipo Model.
 * 
 * modelo.addAttribute("atributoNombreVista1", "Ivor");: Añade un atributo llamado atributoNombreVista1 al modelo con el valor Ivor.
 * 
 * return "vista1";: Devuelve el nombre de la vista vista1, que será resuelta por el ViewResolver.
 * 
 * 
 * 
 * Método 2 (Metodo2):
 * 
 * @GetMapping("/metodo2"): Mapea solicitudes GET a la ruta /metodo2.
 * 
 * public ModelAndView Metodo2(): Método que maneja la solicitud GET a /metodo2 y devuelve una instancia de ModelAndView.
 * 
 * ModelAndView modelo = new ModelAndView("vista2.html");: Crea una nueva instancia de ModelAndView con la vista vista2.html.
 * 
 * modelo.addObject("atributoNombreVista2", "Alexander");: Añade un objeto al modelo con el nombre atributoNombreVista2 y el valor Alexander.
 * 
 * return modelo;: Devuelve la instancia de ModelAndView, que incluye el nombre de la vista y los datos del modelo.
 * 
 * 
 * 
 * 
 * 
 * Flujo de ejecución:
 * Recepción de solicitudes:
 * 
 * Cuando se recibe una solicitud GET a la ruta /metodo1, el método Metodo1 es llamado.
 * 
 * Cuando se recibe una solicitud GET a la ruta /metodo2, el método Metodo2 es llamado.
 * 
 * 
 * 
 * 
 * Procesamiento de la solicitud:
 * 
 * Metodo1 añade un atributo al modelo y devuelve el nombre de la vista vista1.
 * 
 * Metodo2 crea una instancia de ModelAndView, añade un objeto al modelo, y devuelve esta instancia para la vista vista2.html.
 * 
 * 
 * Resolución y renderización de la vista:
 * 
 * El DispatcherServlet de Spring utiliza el ViewResolver para determinar y renderizar la vista apropiada (vista1 o vista2.html) basado en los nombres devueltos por los
 * métodos.
 */













