package aplicacionWeb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import aplicacionWeb.model.entity.EntityUsuarios;
import aplicacionWeb.service.ItfUsuariosService;

@Controller
@RequestMapping("/usuarios")
public class UsuariosController {


	@Autowired
	@Qualifier("implUsuarioServicios")
	private ItfUsuariosService inItfUsuariosService;




	@GetMapping("/form")
	public String UsersForm(Model modelo, @RequestParam(required = true) int id) {

		EntityUsuarios us = new EntityUsuarios();



		if (id != 0){

			us = this.inItfUsuariosService.findEntityUsuariosById(id);


			System.out.println("**************  id!=0 ********************");
			System.out.println("Este es la variable us ===> " + us.getId());
			System.out.println("Este es la variable us ===> " + us.getNombre());
			System.out.println("Este es la variable us ===> " + us.getApellidos());
			System.out.println("Este es la variable us ===> " + us.getTelefono());
			System.out.println("Este es la variable us ===> " + us.getCorreo());
			System.out.println("Este es la variable us ===> " + us.getDireccion());




		}
		System.out.println("**************  id = 0 ********************");

		System.out.println("us.hashCode() ===> " + us.hashCode());
		System.out.println("Este es la variable us ===> " + us.getId());
		System.out.println("Este es la variable us ===> " + us.getNombre());
		System.out.println("Este es la variable us ===> " + us.getApellidos());
		System.out.println("Este es la variable us ===> " + us.getTelefono());
		System.out.println("Este es la variable us ===> " + us.getCorreo());
		System.out.println("Este es la variable us ===> " + us.getDireccion());

		// modelo.addAttribute("MaaUsuarios", new EntityUsuarios());
		modelo.addAttribute("MaaUsuarios", us);
		return "usersForm.html";
	}







	@PostMapping("/add")
	public String addUsuarios(@ModelAttribute EntityUsuarios usuarios) {

		this.inItfUsuariosService.AddUsuarios(usuarios);
		return "redirect:/usuarios/list";

	}


	@GetMapping("/list")
	public ModelAndView ListadoUsers() {

		ModelAndView mav = new ModelAndView("users.html");

		mav.addObject("mavAddObject", this.inItfUsuariosService.ListAllUsuarios());

		return mav;

	}

	@GetMapping("/remove")
	public ModelAndView removeUsurios(@RequestParam(required = true) int id) {

		this.inItfUsuariosService.removeEntityUsuariosById(id);

		return this.ListadoUsers();
	}


}

