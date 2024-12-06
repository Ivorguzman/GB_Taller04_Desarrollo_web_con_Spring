package com.ComoHacerPeticionesPost.controller; // Paquete que contiene la clase PostController

import org.springframework.stereotype.Controller; // Importa la anotación @Controller de Spring
import org.springframework.ui.Model; // Importa la interfaz Model de Spring
import org.springframework.web.bind.annotation.GetMapping; // Importa la anotación @GetMapping de Spring
import org.springframework.web.bind.annotation.ModelAttribute; // Importa la anotación @ModelAttribute de Spring
import org.springframework.web.bind.annotation.PostMapping; // Importa la anotación @PostMapping de Spring
import org.springframework.web.bind.annotation.RequestMapping; // Importa la anotación @RequestMapping de Spring
import org.springframework.web.servlet.ModelAndView; // Importa la clase ModelAndView de Spring
import org.springframework.web.servlet.view.RedirectView; // Importa la clase RedirectView de Spring

import com.ComoHacerPeticionesPost.model.Persona; // Importa la clase Persona del modelo

@Controller // Indica que esta clase es un controlador de Spring MVC
// @RequestMapping(value = "/ejemplopost", method = RequestMethod.POST)
@RequestMapping("/ejemplopost") // Forma abreviada de mapear todas las rutas dentro de esta clase al contexto "/ejemplopost"
class PostController {

	// ************* REDIRECCIONAMIENTOS *************************

	// Forma 1 (Utilizando Mapeo de la ruta y redirigiendo con método)
	@GetMapping("/") // Mapea solicitudes GET a la ruta raíz "/ejemplopost/"
	public String Redirect1() {
		return "redirect:/ejemplopost/form"; // Redirige a la ruta "/ejemplopost/form"
	}

	// Forma 2 (Utilizando RedirectView)
	public RedirectView Redirect2() {
		return new RedirectView(); // Retorna una nueva instancia de RedirectView
	}

	// ************* FIN REDIRECCIONAMIENTOS *************************

	@GetMapping("/form") // Método que devuelve el formulario
	public String Form(Model modelo) {
		System.out.println("modelo ==>" + modelo); // Imprime el modelo en la consola

		modelo.addAttribute("persona", new Persona()); // Añade un atributo "persona" al modelo con una nueva instancia de Persona

		return "formulario"; // Retorna la vista formulario.html
	}

	@PostMapping("/addpersona") // Método que maneja las solicitudes POST a "/addpersona"
	public ModelAndView Resultados(@ModelAttribute("persona") Persona persona) { // Captura los datos del formulario recogidos de la clase Persona

		ModelAndView mav = new ModelAndView("resultados.html"); // Retorna una nueva instancia de ModelAndView con la vista "resultados.html"
		mav.addObject("persona", persona); // Añade el objeto "persona" al modelo
		return mav; // Retorna la instancia de ModelAndView
	}
}


/*
 * Explicación a nivel de bloque y flujo de ejecución:
 * Paquete y importaciones:
 * 
 * package com.ComoHacerPeticionesPost.controller;: Define el paquete donde reside la clase PostController.
 * 
 * Importaciones: Incluyen clases y anotaciones necesarias de Spring Framework y la clase Persona.
 * 
 * Anotaciones de la clase:
 * 
 * @Controller: Marca la clase como un controlador de Spring MVC, lo que permite manejar solicitudes HTTP y devolver vistas.
 * 
 * @RequestMapping("/ejemplopost"): Define que todas las rutas manejadas por esta clase comiencen desde el contexto /ejemplopost.
 * 
 * Métodos para redireccionamientos:
 * 
 * Redirect1:
 * 
 * @GetMapping("/"): Mapea solicitudes GET a la ruta raíz /ejemplopost/.
 * 
 * public String Redirect1(): Método que maneja la redirección.
 * 
 * return "redirect:/ejemplopost/form";: Redirige a la ruta /ejemplopost/form.
 * 
 * Redirect2:
 * 
 * public RedirectView Redirect2(): Método que maneja la redirección utilizando RedirectView.
 * 
 * return new RedirectView();: Retorna una nueva instancia de RedirectView.
 * 
 * Método para mostrar el formulario:
 * 
 * Form:
 * 
 * @GetMapping("/form"): Mapea solicitudes GET a la ruta /ejemplopost/form.
 * 
 * public String Form(Model modelo): Método que maneja la solicitud GET y muestra el formulario.
 * 
 * modelo.addAttribute("persona", new Persona());: Añade un atributo al modelo con una nueva instancia de Persona.
 * 
 * return "formulario";: Retorna la vista formulario.html.
 * 
 * Método para manejar la solicitud POST y mostrar resultados:
 * 
 * Resultados:
 * 
 * @PostMapping("/addpersona"): Mapea solicitudes POST a la ruta /ejemplopost/addpersona.
 * 
 * public ModelAndView Resultados(@ModelAttribute("persona") Persona persona): Método que maneja la solicitud POST y captura los datos del formulario.
 * 
 * ModelAndView mav = new ModelAndView("resultados.html");: Crea una nueva instancia de ModelAndView con la vista resultados.html.
 * 
 * mav.addObject("persona", persona);: Añade el objeto persona al modelo.
 * 
 * return mav;: Retorna la instancia de ModelAndView.
 * 
 * 
 * 
 * Flujo de ejecución:
 * Recepción de solicitudes:
 * 
 * Cuando se recibe una solicitud GET a la ruta /ejemplopost/, se llama al método Redirect1, que redirige a la ruta /ejemplopost/form.
 * 
 * Cuando se recibe una solicitud GET a la ruta /ejemplopost/form, se llama al método Form, que añade un atributo persona al modelo y retorna la vista formulario.html.
 * 
 * Cuando se recibe una solicitud POST a la ruta /ejemplopost/addpersona, se llama al método Resultados, que captura los datos del formulario, añade el objeto persona al
 * modelo, y retorna la vista resultados.html.
 * 
 * 
 * 
 * Procesamiento de la solicitud:
 * 
 * El método Redirect1 maneja la redirección utilizando return "redirect:/ejemplopost/form";.
 * 
 * El método Form prepara el modelo con un nuevo objeto Persona y retorna la vista del formulario.
 * 
 * El método Resultados maneja la captura de los datos del formulario, añade el objeto persona al modelo, y retorna la vista de resultados.
 * 
 * Resolución y renderización de la vista:
 * 
 * El DispatcherServlet de Spring utiliza el ViewResolver para determinar y renderizar la vista apropiada basada en los nombres devueltos por los métodos o las instancias de
 * ModelAndView.
 */
