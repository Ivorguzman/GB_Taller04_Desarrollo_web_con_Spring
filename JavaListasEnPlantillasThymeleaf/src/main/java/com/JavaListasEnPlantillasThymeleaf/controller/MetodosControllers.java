package com.JavaListasEnPlantillasThymeleaf.controller; // Paquete que contiene la clase MetodosControllers

import java.util.ArrayList; // Importa la clase ArrayList para manejar listas
import java.util.List; // Importa la interfaz List

import org.springframework.stereotype.Controller; // Importa la anotación @Controller de Spring
import org.springframework.ui.Model; // Importa la interfaz Model de Spring
import org.springframework.web.bind.annotation.GetMapping; // Importa la anotación @GetMapping de Spring
import org.springframework.web.bind.annotation.RequestMapping; // Importa la anotación @RequestMapping de Spring
import org.springframework.web.servlet.ModelAndView; // Importa la clase ModelAndView de Spring

import com.JavaListasEnPlantillasThymeleaf.model.PersonaLista; // Importa la clase PersonaLista

@Controller // Indica que esta clase es un controlador de Spring MVC
@RequestMapping("/") // Mapea todas las rutas dentro de esta clase al contexto raíz
public class MetodosControllers {

	// Metodo1 (/metodo1)
	@GetMapping("/metodo1") // Mapea solicitudes GET a /metodo1
	public String metodo1(Model modelo) {  // utiliza un parámetro de tipo Model.
		modelo.addAttribute("personaEnClaseLista1", new PersonaLista("Zambrano Alexander", 111222333)); // Añade un atributo al modelo
		return "vista1"; // Devuelve el nombre de la vista "vista1"
	}

	// Metodo 2 (/metodo2)
	@GetMapping("/metodo2") // Mapea solicitudes GET a /metodo2
	public ModelAndView metodo2() { // devuelve una instancia de ModelAndView.
		ModelAndView modeloVistaControlador = new ModelAndView("vista2"); // Crea una nueva instancia de ModelAndView con la vista "vista2"
		modeloVistaControlador.addObject("personaEnClaseLista2", new PersonaLista("Guzmán Ivor", 444555666)); // Añade un objeto al modelo
		return modeloVistaControlador; // Devuelve la instancia de ModelAndView
	}

	// Metodo3 (/metodo3)
	@GetMapping("/metodo3") // Mapea solicitudes GET a /metodo3
	public String metodo3(Model modelo) {// utiliza un parámetro de tipo Model.
		modelo.addAttribute("listaPersona", this.getPersonas()); // Añade una lista de personas al modelo
		return "vista3"; // Devuelve el nombre de la vista "vista3"
	}

	// Metodo 4(/metodo4)
	@GetMapping("/metodo4") // Mapea solicitudes GET a /metodo4
	public ModelAndView metodo4() { // devuelve una instancia de ModelAndView.
		ModelAndView modeloVistaControlador = new ModelAndView("vista3"); // Crea una nueva instancia de ModelAndView con la vista "vista3"
		modeloVistaControlador.addObject("listaPersona", this.getPersonas()); // Añade una lista de personas al modelo
		return modeloVistaControlador; // Devuelve la instancia de ModelAndView
	}

	// Método privado para obtener una lista de personas
	private List<PersonaLista> getPersonas() {// Método que crea y retorna una lista de objetos PersonaLista.

		List<PersonaLista> listaPersona = new ArrayList<>(); // Crea una nueva lista de personas

		listaPersona.add(new PersonaLista("Alejandro", 7821532)); // Añade una nueva persona a la lista
		listaPersona.add(new PersonaLista("Antonio", 9897244)); // Añade una nueva persona a la lista
		listaPersona.add(new PersonaLista("Juan", 7821532)); // Añade una nueva persona a la lista
		listaPersona.add(new PersonaLista("Pedro", 2634442)); // Añade una nueva persona a la lista
		listaPersona.add(new PersonaLista("Miguel", 3429878)); // Añade una nueva persona a la lista

		return listaPersona; // Retorna la lista de personas
	}
}

/*
 * / Explicación a nivel de bloque y flujo de ejecución:
 * Paquete y importaciones:
 * 
 * package com.JavaListasEnPlantillasThymeleaf.controller;: Define el paquete donde reside la clase MetodosControllers.
 * 
 * Importaciones: Incluyen clases y anotaciones necesarias de Spring Framework y la clase PersonaLista.
 * 
 * 
 * Anotaciones de la clase:
 * 
 * @Controller: Marca la clase como un controlador de Spring MVC, lo que permite manejar solicitudes HTTP y devolver vistas.
 * 
 * @RequestMapping("/"): Define que todas las rutas manejadas por esta clase comiencen desde el contexto raíz (/).
 * 
 * Métodos para manejar solicitudes:
 * 
 * 
 * 
 * 
 * 
 * Metodo1:
 * 
 * @GetMapping("/metodo1"): Mapea solicitudes GET a la ruta /metodo1.
 * 
 * public String metodo1(Model modelo): Método que maneja la solicitud GET a /metodo1 y utiliza un parámetro de tipo Model.
 * 
 * modelo.addAttribute("personaEnClaseLista1", new PersonaLista("Zambrano Alexander", 111222333));: Añade un atributo al modelo con un objeto PersonaLista.
 * 
 * return "vista1";: Devuelve el nombre de la vista vista1, que será resuelta por el ViewResolver.
 * 
 * 
 * 
 * 
 * 
 * Metodo2:
 * 
 * @GetMapping("/metodo2"): Mapea solicitudes GET a la ruta /metodo2.
 * 
 * public ModelAndView metodo2(): Método que maneja la solicitud GET a /metodo2 y devuelve una instancia de ModelAndView.
 * 
 * ModelAndView modeloVistaControlador = new ModelAndView("vista2");: Crea una nueva instancia de ModelAndView con la vista vista2.
 * 
 * modeloVistaControlador.addObject("personaEnClaseLista2", new PersonaLista("Guzmán Ivor", 444555666));: Añade un objeto al modelo.
 * 
 * return modeloVistaControlador;: Devuelve la instancia de ModelAndView.
 * 
 * 
 * 
 * 
 * Metodo3:
 * 
 * @GetMapping("/metodo3"): Mapea solicitudes GET a la ruta /metodo3.
 * 
 * public String metodo3(Model modelo): Método que maneja la solicitud GET a /metodo3 y utiliza un parámetro de tipo Model.
 * 
 * modelo.addAttribute("listaPersona", this.getPersonas());: Añade una lista de personas al modelo.
 * 
 * return "vista3";: Devuelve el nombre de la vista vista3.
 * 
 * 
 * 
 * 
 * 
 * Metodo4:
 * 
 * @GetMapping("/metodo4"): Mapea solicitudes GET a la ruta /metodo4.
 * 
 * public ModelAndView metodo4(): Método que maneja la solicitud GET a /metodo4 y devuelve una instancia de ModelAndView.
 * 
 * ModelAndView modeloVistaControlador = new ModelAndView("vista3");: Crea una nueva instancia de ModelAndView con la vista vista3.
 * 
 * modeloVistaControlador.addObject("listaPersona", this.getPersonas());: Añade una lista de personas al modelo.
 * 
 * return modeloVistaControlador;: Devuelve la instancia de ModelAndView.
 * 
 * Método privado para obtener una lista de personas:
 * 
 * private List<PersonaLista> getPersonas(): Método que crea y retorna una lista de objetos PersonaLista.
 * 
 * List<PersonaLista> listaPersona = new ArrayList<>();: Crea una nueva lista de personas.
 * 
 * Añade varias personas a la lista utilizando el constructor de PersonaLista.
 * 
 * return listaPersona;: Retorna la lista de personas.
 * 
 * Flujo de ejecución:
 * Recepción de solicitudes:
 * 
 * Cuando se recibe una solicitud GET a las rutas /metodo1, /metodo2, /metodo3, o /metodo4, se llaman los métodos correspondientes (metodo1, metodo2, metodo3, metodo4).
 * 
 * Procesamiento de la solicitud:
 * 
 * metodo1 añade un atributo con un objeto PersonaLista y devuelve el nombre de la vista vista1.
 * 
 * metodo2 crea una instancia de ModelAndView, añade un objeto PersonaLista, y devuelve la instancia para la vista vista2.
 * 
 * metodo3 añade una lista de personas al modelo y devuelve el nombre de la vista vista3.
 * 
 * metodo4 crea una instancia de ModelAndView, añade una lista de personas, y devuelve la instancia para la vista vista3.
 * 
 * Resolución y renderización de la vista:
 * 
 * El DispatcherServlet de Spring utiliza el ViewResolver para determinar y renderizar la vista apropiada basada en los nombres devueltos por los métodos o las instancias de
 * ModelAndView
 */

