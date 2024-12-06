package validacion_formulario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import validacion_formulario.dao.ItfEstudianteDao;

@Controller
public class FormController {


	@Autowired
	private ItfEstudianteDao itfEstudianteDao;


	// ItfEstudianteDao itfEstudianteDao= new ItfEstudianteDao();



}
