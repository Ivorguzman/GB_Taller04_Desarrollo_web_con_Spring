package Logs_y_Componentes.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import Logs_y_Componentes.component.PrimerComponente;


@Controller
@RequestMapping("/")
public class LogController {

	/*
	 * La anotación @Autowired le dice a Spring que busque un bean de tipo PrimerComponente en el
	 * contenedor y lo inyecte en el atributo primerComponente de la clase. Esto evita tener que crear
	 * manualmente una instancia de PrimerComponente usando el operador new.
	 * equivale a [PrimerComponente primerComponente = new PrimerComponente();]
	 */
	@Autowired()
	/*
	 * La anotación @Qualifier le dice a Spring qué bean específico de tipo PrimerComponente debe
	 * inyectar, en caso de que haya más de uno definido en el contenedor. En este caso, el valor
	 * “primerComponente” indica el nombre del bean que se quiere usar. Este nombre debe coincidir con
	 * el que se le ha dado al bean en su anotación @Component o en el archivo de configuración de
	 * Spring. Equivale a [this.primerComponente=primerComponente;]
	 */
	@Qualifier("primerComponente")
	private PrimerComponente primerComponente;


	// Cración del objeto Log (MILOG)
	private static final Log MILOG_CONTROLLER = LogFactory.getLog(LogController.class);

	@GetMapping("/metodo1")
	public String Metodo1() {

		this.primerComponente.EjemploComponente();

		MILOG_CONTROLLER.info("ESTAMOS ENTRANDO EN EL METODO 1");
		return "vista1";
	}

	@GetMapping("/metodo2")
	public String Metodo2() {

		this.primerComponente.EjemploComponente();
		MILOG_CONTROLLER.info("ESTAMOS ENTRANDO EN EL METODO 2");

		return "vista2";
	}
}





