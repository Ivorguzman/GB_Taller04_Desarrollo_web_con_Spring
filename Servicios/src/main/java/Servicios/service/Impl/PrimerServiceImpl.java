package Servicios.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import Servicios.model.Persona;
import Servicios.service.IPrimerService;


@Service("primerServiceImpl")
public class PrimerServiceImpl implements IPrimerService {


	@Override
	public List<Persona> getPersonas() {

		List<Persona> p = new ArrayList<>();
		p.add(new Persona("Ivor", "Guzman"));   // Inicializando clase por medio del constructor
		p.add(new Persona("Alexander", "Zambrano"));   // Inicializando clase por medio del constructor
		p.add(new Persona("Pablo", "Tarzo"));   // Inicializando clase por medio del constructor
		p.add(new Persona("Pedro", "Galilea"));   // Inicializando clase por medio del constructor
		return p;
	}


}















