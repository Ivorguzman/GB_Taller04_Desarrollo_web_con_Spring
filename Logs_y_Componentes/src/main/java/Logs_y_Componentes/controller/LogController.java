package Logs_y_Componentes.controller; // Define el paquete donde se encuentra esta clase

import org.apache.commons.logging.Log; // Importa la interfaz Log de Apache Commons Logging
import org.apache.commons.logging.LogFactory; // Importa la clase LogFactory de Apache Commons Logging
import org.springframework.beans.factory.annotation.Autowired; // Importa la anotación @Autowired de Spring
import org.springframework.beans.factory.annotation.Qualifier; // Importa la anotación @Qualifier de Spring
import org.springframework.stereotype.Controller; // Importa la anotación @Controller de Spring
import org.springframework.web.bind.annotation.GetMapping; // Importa la anotación @GetMapping de Spring
import org.springframework.web.bind.annotation.RequestMapping; // Importa la anotación @RequestMapping de Spring

import Logs_y_Componentes.component.PrimerComponente; // Importa la clase PrimerComponente desde el paquete component


@Controller // Indica que esta clase es un controlador de Spring MVC
@RequestMapping("/") // Mapea las solicitudes HTTP para la raíz del sitio ("/")
public class LogController {

	/*
	 * La anotación @Autowired le dice a Spring que busque un bean de tipo PrimerComponente en el
	 * contenedor y lo inyecte en el atributo primerComponente de la clase. Esto evita tener que crear
	 * manualmente una instancia de PrimerComponente usando el operador new.
	 * Equivale a [PrimerComponente primerComponente = new PrimerComponente();]
	 */


	/*
	 * La anotación @Qualifier le dice a Spring qué bean específico de tipo PrimerComponente debe
	 * inyectar, en caso de que haya más de uno definido en el contenedor. En este caso, el valor
	 * “primerComponente” indica el nombre del bean que se quiere usar. Este nombre debe coincidir con
	 * el que se le ha dado al bean en su anotación @Component o en el archivo de configuración de
	 * Spring. Equivale a [this.primerComponente=primerComponente;]
	 */
	@Autowired()
	@Qualifier("primerComponente")
	private PrimerComponente primerComponente; // Declara un atributo para el bean PrimerComponente


	// Creación del objeto Log (MILOG)
	private static final Log MILOG_CONTROLLER = LogFactory.getLog(LogController.class);

	// Mapea solicitudes GET a la ruta "/metodo1"
	@GetMapping("/metodo1")
	public String Metodo1() {
		// Llama al método EjemploComponente del bean PrimerComponente
		this.primerComponente.EjemploComponente();

		// Registra un mensaje de información en los logs
		MILOG_CONTROLLER.info("ESTAMOS ENTRANDO EN EL METODO 1");
		return "vista1"; // Retorna la vista "vista1"
	}




	// Mapea solicitudes GET a la ruta "/metodo2"
	@GetMapping("/metodo2")
	public String Metodo2() {
		// Llama al método EjemploComponente del bean PrimerComponente
		this.primerComponente.EjemploComponente();

		// Registra un mensaje de información en los logs
		MILOG_CONTROLLER.info("ESTAMOS ENTRANDO EN EL METODO 2");

		return "vista2"; // Retorna la vista "vista2"
	}
}
