package com.ComoHacerPeticionesGet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class PeticionesController {

	@GetMapping("/peticiones1") // Forma1: localhost:8080/peticiones1?nombre=Maria
	public ModelAndView Peticiones1(@RequestParam(name = "nombre") String elNombre) {

		ModelAndView mav = new ModelAndView("index");
		mav.addObject("nombre", elNombre);

		return mav;



	}

	@GetMapping("/peticiones2/{nombre}") // Forma1: localhost:8080/peticiones2/Maria
	public ModelAndView Peticiones2(@PathVariable(name = "nombre") String elNombre) {

		ModelAndView mav = new ModelAndView("index");
		mav.addObject("nombre", elNombre);

		return mav;


	}

}
