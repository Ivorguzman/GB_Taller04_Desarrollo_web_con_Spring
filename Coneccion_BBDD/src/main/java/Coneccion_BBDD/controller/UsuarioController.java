package Coneccion_BBDD.controller; // Define el paquete donde se encuentra esta clase

import org.springframework.beans.factory.annotation.Autowired; // Importa la anotación @Autowired de Spring
import org.springframework.beans.factory.annotation.Qualifier; // Importa la anotación @Qualifier de Spring
import org.springframework.stereotype.Controller; // Importa la anotación @Controller de Spring
import org.springframework.web.bind.annotation.GetMapping; // Importa la anotación @GetMapping de Spring
import org.springframework.web.bind.annotation.ModelAttribute; // Importa la anotación @ModelAttribute de Spring
import org.springframework.web.bind.annotation.PostMapping; // Importa la anotación @PostMapping de Spring
import org.springframework.web.bind.annotation.RequestMapping; // Importa la anotación @RequestMapping de Spring
import org.springframework.web.servlet.ModelAndView; // Importa la clase ModelAndView de Spring

import Coneccion_BBDD.Service.I_UsuarioService; // Importa la interfaz ItfUsuarioService
import Coneccion_BBDD.model.Usuario; // Importa la clase Usuario

@Controller // Marca la clase como un controlador de Spring MVC
@RequestMapping("/user") // Define la ruta base para este controlador
public class UsuarioController {

	@Autowired // Indica que Spring debe inyectar una instancia del bean ItfUsuarioService
	@Qualifier("itfUsuarioService") // Especifica cuál bean debe ser inyectado si hay más de uno
	private I_UsuarioService itfUsuarioService; // Declaración del servicio

	@GetMapping("/list") // Mapea las solicitudes GET a la ruta "/list"
	public ModelAndView listarUsuarios() {
		ModelAndView mav = new ModelAndView("list.html"); // Crea una instancia de ModelAndView con la vista "list.html"
		mav.addObject("thUsuario", this.itfUsuarioService.listAllUsuario()); // Añade la lista de usuarios al ModelAndView
		mav.addObject("thUser", new Usuario()); // Añade un nuevo objeto Usuario al ModelAndView
		return mav; // Retorna el ModelAndView

		/*
		 * La línea de código; mav.addObject("thUser", new Usuario()); Vamos a desglosarla:
		 * 
		 * - mav: Es una instancia de la clase ModelAndView, que se utiliza para manejar la vista y los
		 * datos que se envían a la vista en una aplicación web.
		 * 
		 * - .addObject("thUser", new Usuario()): Aquí estamos agregando un objeto llamado "thUser" al
		 * ModelAndView. El objeto que se está agregando es una nueva instancia de la clase Usuario.
		 * 
		 * - "thUser": Es el nombre del atributo que se utilizará en la vista para acceder al objeto
		 * Usuario.
		 * 
		 * - new Usuario(): Crea una nueva instancia de la clase Usuario.
		 * 
		 * En resumen, esta línea de código está creando un objeto Usuario y lo está agregando al
		 * ModelAndView con el nombre de atributo "thUser". Luego, este objeto se puede utilizar en la vista
		 * para mostrar información relacionada con el usuario.
		 */
	}

	@PostMapping("/add") // Mapea las solicitudes POST a la ruta "/add"
	public String agregarUsuario(@ModelAttribute(name = "VcUsuarios") Usuario elUsuario) {
		this.itfUsuarioService.addUsuario(elUsuario); // Guarda el usuario utilizando el servicio
		return "redirect:/user/list"; // Redirige a la lista de usuarios después de añadir uno nuevo

		/*
		 * Nota: name = "VcUsuarios" no es utilizada;
		 * 
		 * La línea public String agregarUsuario(@ModelAttribute(name = "VcUsuarios") Usuario
		 * elUsuario) Vamos a desglosarla:
		 * 
		 * - public String agregarUsuario(@ModelAttribute(name = "VcUsuarios") Usuario elUsuario): Esta es
		 * una firma de método en Java. Aquí tienes una explicación de cada parte:
		 * - public String: Indica que este método es público y devuelve un valor de tipo String.
		 * 
		 * - agregarUsuario: Es el nombre del método.
		 * 
		 * - @ModelAttribute(name = "VcUsuarios"): Esto es una anotación que se utiliza en Spring. En este
		 * caso, le dice al framework que debe vincular el objeto Usuario (que se pasa como argumento) con
		 * el atributo "VcUsuarios" en la vista.
		 * 
		 * - Usuario elUsuario: Aquí estamos declarando un parámetro llamado elUsuario de tipo Usuario.
		 * 
		 * En resumen, esta línea de código define un método público llamado agregarUsuario que acepta un
		 * objeto Usuario como parámetro y lo vincula con el atributo "VcUsuarios" en la vista. La función
		 * completa debe estar dentro de una clase y se utiliza para agregar usuarios en algún
		 * contexto específico de una aplicación web.
		 */
	}
}



/*
 * Se trata de un controlador de Spring MVC, que es un framework para crear aplicaciones web basadas
 * en el patrón Modelo-Vista-Controlador. El código hace lo siguiente:
 * 
 * - Declara la clase UsuarioController con la anotación @Controller, que indica que es un
 * componente de Spring que maneja las peticiones web.
 * 
 * - Asigna la ruta "/user" a todos los métodos del controlador con la anotación @RequestMapping,
 * que permite mapear las peticiones web a los métodos según la URL y el método HTTP.
 * 
 * - Inyecta una dependencia de tipo ItfUsuarioService con las anotaciones @Autowired y @Qualifier,
 * que permiten obtener un bean de Spring por tipo y por nombre, respectivamente. Este servicio se
 * encarga de la lógica de negocio relacionada con los usuarios, como listarlos o agregarlos.
 * 
 * - Define un método listarUsuarios que se ejecuta cuando se recibe una petición GET a la ruta
 * "/user/list" con la anotación @GetMapping, que es una variante de @RequestMapping. Este método
 * crea un objeto ModelAndView, que sirve para enviar datos y vistas al navegador.
 * El constructor de ModelAndView recibe el nombre de la vista, que en este caso es "list.html", una
 * página que muestra la lista de usuarios.
 * El método addObject de ModelAndView añade dos atributos al modelo: "thUsuario", que contiene la
 * lista de todos los usuarios obtenida del servicio, y "user", que contiene un nuevo objeto Usuario
 * vacío.
 * Estos atributos se pueden acceder desde la vista con las expresiones ${thUsuario} y ${user}. El
 * método devuelve el objeto ModelAndView.
 * 
 * 
 * - Define un método agregarUsuario que se ejecuta cuando se recibe una petición POST a la ruta
 * "/user/add" con la anotación @PostMapping, que es otra variante de @RequestMapping. Este método
 * recibe un parámetro de tipo Usuario con la anotación @ModelAttribute, que permite obtener los
 * datos del formulario web que se envían en la petición. El nombre del atributo es "VcUsuarios",
 * que debe coincidir con el nombre del objeto Usuario en la vista. El método llama al servicio para
 * agregar el usuario al sistema, y luego devuelve una cadena que indica la ruta a la que se debe
 * redirigir la petición, que en este caso es "/user/list", para mostrar la lista actualizada de
 * usuarios.
 */


