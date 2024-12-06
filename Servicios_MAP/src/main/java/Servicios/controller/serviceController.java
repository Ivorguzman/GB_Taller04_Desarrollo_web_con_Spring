package Servicios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import Servicios.service.Impl.PrimerServiceImpl;

@Controller
@RequestMapping("/")
public class serviceController {
	
	@Autowired
	@Qualifier("primerServiceImpl")
	private PrimerServiceImpl primerServiceImpl;

	@GetMapping("/listado")
	public String ListadoPersonas(Model modelo) {
		modelo.addAttribute("p", this.primerServiceImpl.getPersonas());

		return "listado.html";
	}

}







