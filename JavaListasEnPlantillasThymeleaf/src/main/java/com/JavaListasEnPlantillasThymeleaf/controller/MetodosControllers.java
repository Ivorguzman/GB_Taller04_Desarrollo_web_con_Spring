package com.JavaListasEnPlantillasThymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.JavaListasEnPlantillasThymeleaf.model.PersonaLista;

@Controller
@RequestMapping("/")
public class MetodosControllers {

	/*
	 * @GetMapping(“/metodo1”) es una anotación de Spring que indica que el método metodo1() debe manejar las peticiones HTTP GET que coincidan con la ruta “/metodo1”. Es una
	 * versión simplificada de @RequestMapping(method = RequestMethod.GET, value = “/metodo1”).
	 * 
	 * El método metodo1() recibe un parámetro de tipo Model, que es una interfaz de Spring que representa el modelo de datos que se quiere pasar a la vista. El método usa el
	 * método addAttribute() del modelo para añadir un atributo llamado “personaEnClaseLista1”, que tiene como valor un objeto de tipo PersonaLista con el nombre “Zambrano
	 * Alexander” y el teléfono 111222333. Este atributo se puede usar en la vista para mostrar información sobre la persona.
	 * 
	 * El método metodo1() devuelve un String que representa el nombre de la vista que se quiere mostrar. En este caso, el nombre de la vista es “vista1”, lo que significa
	 * que Spring buscará un archivo llamado vista1.jsp (o vista1.html, dependiendo de la configuración) en el directorio de vistas de la aplicación.
	 */

	// Metodo1 (/metodo1)
	@GetMapping("/metodo1") public String metodo1(Model modelo) {
		modelo.addAttribute("personaEnClaseLista1", new PersonaLista("Zambrano Alexander", 111222333));
		return "vista1";
	}



	/*
	 * @GetMapping es una anotación de Spring que indica que el método que la lleva debe manejar las peticiones HTTP GET que coincidan con la ruta
	 * especificada. En este caso, la ruta es “/metodo2”, lo que significa que el método metodo2() se ejecutará cuando se reciba una petición GET a esa dirección.
	 * El método metodo2() devuelve un objeto de tipo ModelAndView, que es una clase de Spring que encapsula tanto el nombre de la vista que se quiere mostrar como el modelo
	 * que se quiere pasar a esa vista. En este caso, el nombre de la vista es “vista2”, lo que significa que Spring buscará un archivo llamado vista2.jsp (o vista2.html,
	 * dependiendo de la configuración) en el directorio de vistas de la aplicación.
	 * El modelo es un conjunto de atributos que se pueden usar en la vista para mostrar información dinámica. En este caso, el método metodo2() añade un solo atributo al
	 * modelo, llamado “personaEnClaseLista2”, que tiene como valor un objeto de tipo PersonaLista con el nombre “Guzmán Ivor” y el teléfono 444555666. Este atributo se puede
	 * acceder desde la vista usando la expresión personaEnClaseLista2osuspropiedades,como{personaEnClaseLista2.nombre} o ${personaEnClaseLista2.telefono}.
	 */
	// Metodo 2 (/metodo2)
	@GetMapping("/metodo2")
	public ModelAndView metodo2() {
		ModelAndView modeloVistaControlador = new ModelAndView("vista2");
		modeloVistaControlador.addObject("personaEnClaseLista2", new PersonaLista("Guzmán Ivor", 444555666));
		return modeloVistaControlador;
	}
	
	
	
	// Metodo1 (/metodo3)
	@GetMapping("/metodo3")
	public String metodo3(Model modelo) {
		modelo.addAttribute("listaPersona", this.getPersonas());
		return "vista3";
	}

	
	
	// Metodo 4(/metodo4)
	@GetMapping("/metodo4")
	public ModelAndView metodo4() {
		ModelAndView modeloVistaControlador = new ModelAndView("vista3");
		modeloVistaControlador.addObject("listaPersona", this.getPersonas());
			return modeloVistaControlador;
		}
		
		
	

	private List<PersonaLista> getPersonas(){
		
		List<PersonaLista> listaPersona = new ArrayList<>();
		
		listaPersona.add(new PersonaLista("Alejandro", 7821532));
		listaPersona.add(new PersonaLista("Antonio", 9897244));
		listaPersona.add(new PersonaLista("Juan", 7821532));
		listaPersona.add(new PersonaLista("Pedro", 2634442));
		listaPersona.add(new PersonaLista("Miguel", 3429878));
		
		return listaPersona;
		
		
		
		
	}
}










































