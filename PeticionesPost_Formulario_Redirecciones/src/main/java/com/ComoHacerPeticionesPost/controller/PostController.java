package com.ComoHacerPeticionesPost.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.ComoHacerPeticionesPost.model.Persona;


/*
 * El código una forma de crear un controlador que procesa los datos de un formulario web y devuelve
 * una vista con un modelo. Vamos a ver cada parte del código:
 * 
 * - La anotación @GetMapping("/form") indica que este método se encarga de manejar las peticiones
 * HTTP GET que llegan a la ruta "/form". Es una forma abreviada de
 *
 * @RequestMapping(value = "/form", method = RequestMethod.GET) .
 * Esta anotación se usa para mapear las URLs de las peticiones con los métodos del controlador,
 * especificando el tipo de método HTTP que se acepta. En este caso, solo se aceptan las peticiones
 * GET, que son las que se usan para solicitar datos al servidor sin enviar ningún contenido en el
 * cuerpo de la petición.
 * 
 * - La anotación [@RequestMapping(value = "/ejemplopost", method = RequestMethod.POST)]
 * indica que este método se encarga de manejar las
 * peticiones HTTP POST que llegan a la ruta "/addpersona". Es una forma abreviada
 * de [@RequestMapping(value = "/addpersona", method = RequestMethod.POST)] .
 * 
 * - El parámetro [@ModelAttribute("persona") Persona persona] indica que el método recibe un objeto
 * de tipo Persona que se crea a partir de los datos del formulario web [th:object="${persona}].
 * La anotación @ModelAttribute le dice a Spring MVC que busque un atributo llamado "persona" en el
 * modelo (un mapa de atributos de una clase), y si no lo encuentra, que lo cree usando el
 * constructor por defecto y lo llene con los valores que coincidan con los nombres de las
 * propiedades del objeto Persona .
 * Por ejemplo, si el formulario tiene un campo de entrada llamado "nombre",
 * Spring MVC asignará el valor de ese campo a la propiedad "nombre" del objeto Persona.
 * 
 * - La línea System.out.println("persona ==>" + persona); es solo para imprimir en la consola el
 * objeto Persona que se ha creado. No tiene ningún efecto en la respuesta web.
 * 
 * - La línea [ModelAndView mav = new ModelAndView("reultados.html")]; crea un objeto de tipo
 * ModelAndView, que es una clase que contiene tanto el modelo como la vista que se
 * quiere devolver . El constructor recibe el nombre de la vista, que en este caso es
 * "reultados.html". Spring MVC buscará un archivo con ese nombre en el directorio de las
 * vistas, que por defecto es "/src/main/sources/remplates/*.html".
 * 
 * - La línea mav.addObject("persona", persona); añade el objeto Persona al modelo con el nombre
 * "persona". Esto hace que el objeto Persona esté disponible para la vista, y
 * se pueda acceder a sus propiedades usando expresiones como ${persona.nombre}.
 * 
 * - La línea return mav; devuelve el objeto ModelAndView al DispatcherServlet, que es el componente
 * de Spring MVC que se encarga de resolver la vista y enviar la respuesta
 * al cliente.
 */

@Controller
// @RequestMapping(value = "/ejemplopost", method = RequestMethod.POST)
@RequestMapping("/ejemplopost") // Forma abreviada
class PostController {


	// ************* REDIRECCIONAMIENTOS *************************

	// Forma 1 ( Utilizando Mapeo de la ruta y redidccionando con metodo)
	@GetMapping("/")
	public String Redirect1() {
		return "redirect:/ejemplopost/form";
	}
	


	// Forma 2 (}
	public RedirectView Redirect2() {

		return new RedirectView();
	}
	// ************* FIN REDIRECCIONAMIENTOS *************************




	@GetMapping("/form") // Metodo que devuelve el formulario
	public String Form(Model modelo) {
		System.out.println("modelo ==>" + modelo);

		modelo.addAttribute("persona", new Persona());

		return "formulario"; // retorna la vista formulario.html
	}



	/*
	 * Un ModelAndView es una clase que combina un modelo (un mapa de atributos) y una
	 * vista (un nombre de plantilla o una referencia a una vista) para ser renderizados por un
	 * controlador.
	 */
	@PostMapping("/addpersona")
	public ModelAndView Resultados(@ModelAttribute("persona") Persona persona) { // Capturar los datos del fomulario recojidos de la clase Persona con =>
																				 // [th:object="${persona}]
		// System.out.println("persona ==>" + persona);

		ModelAndView mav = new ModelAndView("resultados.html");// Retornamos la vista
		mav.addObject("persona", persona); //
		return mav;
	}
}






