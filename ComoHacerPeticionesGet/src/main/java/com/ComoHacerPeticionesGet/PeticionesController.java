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



	/*
	 * Diferencias clave entre los métodos public ModelAndView Peticiones1 y public ModelAndView Peticiones2,
	 * aunque ambos manejan solicitudes GET y retornan un objeto ModelAndView:
	 * 
	 * Forma de obtener el parámetro:
	 * 
	 * @RequestParam (Método 1):
	 * 
	 * Utiliza @RequestParam para capturar un parámetro de la query string de la URL.
	 * 
	 * Ejemplo de URL: http://localhost:8080/peticiones1?clave_nombre=Maria
	 * 
	 * (@RequestParam(name = "clave_nombre") String valor_nombre )toma el valor de clave_nombre de la URL.
	 * 
	 * 
	 * 
	 * @PathVariable (Método 2):
	 * 
	 * Utiliza @PathVariable para capturar un parámetro directamente de la ruta de la URL.
	 * 
	 * Ejemplo de URL: http://localhost:8080/peticiones2/Maria
	 * 
	 * @PathVariable(name = "clave_nombre") String valor_nombre toma el valor de clave_nombre del segmento de la ruta.
	 * 
	 * 
	 * 
	 * 
	 * Rutas de acceso:
	 * 
	 * Método 1:
	 * 
	 * La ruta es /peticiones1 y espera un parámetro en la query string (?clave_nombre=Maria).
	 * 
	 * 
	 * 
	 * Método 2:
	 * 
	 * La ruta es /peticiones2/{clave_nombre} y espera que el parámetro esté incluido como parte de la URL (/peticiones2/Maria).
	 * 
	 * 
	 * 
	 * Vistas retornadas:
	 * 
	 * Método 1:
	 * 
	 * Retorna la vista index.
	 * 
	 * 
	 * 
	 * Método 2:
	 * 
	 * Retorna la vista index2.
	 * 
	 * 
	 * Resumen:
	 * Método 1: Usa @RequestParam para capturar el parámetro desde la query string de la URL (?clave_nombre=Maria) y retorna la vista index.
	 * 
	 * Método 2: Usa @PathVariable para capturar el parámetro desde el segmento de la ruta de la URL (/peticiones2/Maria) y retorna la vista index2.
	 * 
	 * Estas diferencias permiten diferentes formas de pasar parámetros a la aplicación dependiendo de cómo se estructuren las URL.
	 */
	// localhost:8080/peticiones1/?clave_nombre=Maria
	@GetMapping("/peticiones1") // Mapea solicitudes GET a /peticiones1 (localhost:8080/peticiones1?clave_nombre=Maria)
	public ModelAndView Peticiones1(@RequestParam(name = "clave_nombre") String valor_nombre) {
		ModelAndView mav = new ModelAndView("index"); // Crea una nueva instancia de ModelAndView con la vista "index"
		mav.addObject("clave_nombre", valor_nombre); // Añade el clave_nombre como atributo al modelo
		return mav; // Retorna la instancia de ModelAndView
	}

	@GetMapping("/peticiones2/{clave_nombre}") // Mapea solicitudes GET a /peticiones2/{clave_nombre} (localhost:8080/peticiones2/Maria)
	public ModelAndView Peticiones2(@PathVariable(name = "clave_nombre") String valor_nombre) {
		ModelAndView mav = new ModelAndView("index2"); // Crea una nueva instancia de ModelAndView con la vista "index"
		mav.addObject("clave_nombre", valor_nombre); // Añade el clave_nombre como atributo al modelo
		return mav; // Retorna la instancia de ModelAndView
	}

	/*
	 * 
	 * Explicación a nivel de bloque y flujo de ejecución:
	 * Paquete y importaciones:
	 * 
	 * package com.ComoHacerPeticionesGet;: Define el paquete donde reside la clase PeticionesController.
	 * 
	 * Importaciones: Incluyen clases y anotaciones necesarias de Spring Framework para manejar las solicitudes GET y devolver vistas.
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
	 * Peticiones1:
	 * 
	 * @GetMapping("/peticiones1"): Mapea solicitudes GET a la ruta /peticiones1.
	 * 
	 * public ModelAndView Peticiones1(@RequestParam(name = "clave_nombre") String valor_nombre): Método que maneja la solicitud GET a /peticiones1 y recibe un parámetro
	 * clave_nombre desde
	 * la query string.
	 * 
	 * ModelAndView mav = new ModelAndView("index");: Crea una nueva instancia de ModelAndView con la vista index.
	 * 
	 * mav.addObject("clave_nombre", valor_nombre);: Añade el clave_nombre como atributo al modelo.
	 * 
	 * return mav;: Retorna la instancia de ModelAndView.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Peticiones2:
	 * 
	 * @GetMapping("/peticiones2/{clave_nombre}"): Mapea solicitudes GET a la ruta /peticiones2/{clave_nombre}.
	 * 
	 * public ModelAndView Peticiones2(@PathVariable(name = "clave_nombre") String valor_nombre): Método que maneja la solicitud GET a /peticiones2/{clave_nombre} y recibe un
	 * parámetro
	 * clave_nombre desde la ruta.
	 * 
	 * ModelAndView mav = new ModelAndView("index");: Crea una nueva instancia de ModelAndView con la vista index.
	 * 
	 * mav.addObject("clave_nombre", valor_nombre);: Añade el clave_nombre como atributo al modelo.
	 * 
	 * return mav;: Retorna la instancia de ModelAndView.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Flujo de ejecución:
	 * Recepción de solicitudes:
	 * 
	 * Cuando se recibe una solicitud GET a la ruta /peticiones1?clave_nombre=Maria, se llama al método Peticiones1, que obtiene el parámetro clave_nombre desde la query
	 * string.
	 * 
	 * Cuando se recibe una solicitud GET a la ruta /peticiones2/Maria, se llama al método Peticiones2, que obtiene el parámetro clave_nombre desde la ruta.
	 * 
	 * Procesamiento de la solicitud:
	 * 
	 * El método Peticiones1 crea una instancia de ModelAndView, añade el clave_nombre como atributo al modelo y retorna la vista index.
	 * 
	 * El método Peticiones2 crea una instancia de ModelAndView, añade el clave_nombre como atributo al modelo y retorna la vista index.
	 * 
	 * Resolución y renderización de la vista:
	 * 
	 * * El DispatcherServlet de Spring utiliza el ViewResolver para determinar y renderizar la vista index con el modelo que contiene el clave_nombre recibido.
	 * 
	 * 
	 */

}
