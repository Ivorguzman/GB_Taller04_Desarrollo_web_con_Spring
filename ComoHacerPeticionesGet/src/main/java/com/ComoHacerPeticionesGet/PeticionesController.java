package com.ComoHacerPeticionesGet; // Paquete que contiene la clase PeticionesController

import org.springframework.stereotype.Controller; // Importa la anotación @Controller de Spring
import org.springframework.web.bind.annotation.GetMapping; // Importa la anotación @GetMapping de Spring
import org.springframework.web.bind.annotation.PathVariable; // Importa la anotación @PathVariable de Spring
import org.springframework.web.bind.annotation.RequestMapping; // Importa la anotación @RequestMapping de Spring
import org.springframework.web.bind.annotation.RequestParam; // Importa la anotación @RequestParam de Spring
import org.springframework.web.servlet.ModelAndView; // Importa la clase ModelAndView de Spring

@Controller // Indica que esta clase es un controlador de Spring MVC
@RequestMapping("/") // Mapea todas las rutas dentro de esta clase al contexto raíz
public class PeticionesController {

	// ********** /peticiones1?clave_nombre=XYZ => ( @RequestParam ) ***************
	@GetMapping("/peticiones1") // Mapea solicitudes GET a /peticiones1 (localhost:8080/peticiones1?clave_nombre=Maria)
	public ModelAndView Peticiones1(@RequestParam(name = "clave_nombre") String valor_nombre) {
		// Crea una nueva instancia de ModelAndView con la vista "index"
		ModelAndView mav = new ModelAndView("index");

		// Añade el parámetro clave_nombre como atributo al modelo, con el valor de valor_nombre
		mav.addObject("clave_nombre", valor_nombre);

		// Retorna la instancia de ModelAndView
		return mav;
	}

	// *********** /peticiones2/XYZ => ( @PathVariable ) **************
	@GetMapping("/peticiones2/{clave_nombre}") // Mapea solicitudes GET a /peticiones2/{clave_nombre} (localhost:8080/peticiones2/Maria)
	public ModelAndView Peticiones2(@PathVariable(name = "clave_nombre") String valor_nombre) {
		// Crea una nueva instancia de ModelAndView con la vista "index2"
		ModelAndView mav = new ModelAndView("index2");

		// Añade el parámetro clave_nombre como atributo al modelo, con el valor de valor_nombre
		mav.addObject("clave_nombre", valor_nombre);

		// Retorna la instancia de ModelAndView
		return mav;
	}



	/*
	 * Resumen:
	 * Peticiones1 usa @RequestParam para capturar el parámetro desde la query string (?clave_nombre=Maria)
	 * y retorna la vista index con el modelo que contiene clave_nombre.
	 * 
	 * Peticiones2 usa @PathVariable para capturar el parámetro desde la ruta (/peticiones2/Maria)
	 * y retorna la vista index2 con el modelo que contiene clave_nombre.
	 */

}
