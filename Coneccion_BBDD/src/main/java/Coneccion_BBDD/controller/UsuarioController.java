package Coneccion_BBDD.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Coneccion_BBDD.Service.ItfUsuarioService;
import Coneccion_BBDD.model.Usuario;



@Controller
@RequestMapping("/user")
public class UsuarioController {

	@Autowired
	@Qualifier("itfUsuarioService")
	private ItfUsuarioService itfUsuarioService;

	@GetMapping("/list")
	public ModelAndView listarUsuarios() {

		ModelAndView mav = new ModelAndView("list.html");
		mav.addObject("thUsuario", this.itfUsuarioService.listAllUsuario());
		mav.addObject("thUser", new Usuario());
		return mav;

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
		 * 
		 */
	}


	@PostMapping("/add")
	public String agregarUsuario(@ModelAttribute(name = "VcUsuarios") Usuario elUsuario) {

		this.itfUsuarioService.addUsuario(elUsuario);

		return "redirect:/user/list";

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
		 * - Gratis: La palabra "Gratis" al final no parece estar relacionada directamente con la línea de
		 * código. Puede ser un comentario o una nota adicional, pero no afecta la funcionalidad del código
		 * en sí.
		 * En resumen, esta línea de código define un método público llamado agregarUsuario que acepta un
		 * objeto Usuario como parámetro y lo vincula con el atributo "VcUsuarios" en la vista. La función
		 * completa estar dentro de una clase y se utiliza para agregar usuarios en algún
		 * contexto específico de una aplicación web.
		 * 
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


