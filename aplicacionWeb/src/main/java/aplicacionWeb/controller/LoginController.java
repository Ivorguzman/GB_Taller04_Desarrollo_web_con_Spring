package aplicacionWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import aplicacionWeb.model.Credenciales;

@Controller
public class LoginController {



	@GetMapping("/")
	public String RedirectLogin() {

		return "redirect:/login";
	}



	@GetMapping("/login")
	public String Login(Model modelo, @RequestParam(name = "RpError", required = false) String error, @RequestParam(name = "RpLogout", required = false) String logout) {
		modelo.addAttribute("MaaError", error);
		modelo.addAttribute("MaaLogOut", logout);
		modelo.addAttribute("MaaCredenciales", new Credenciales());
		return "login.html";
	}
	/*
	 * Método Login con varios parámetros
	 * 
	 * - @GetMapping("/"): Esto es una anotación que se utiliza en Spring Framework para mapear una
	 * solicitud HTTP GET a un método controlador. En este caso, el método Login se invocará cuando se
	 * realice una solicitud GET a la raíz del contexto de la aplicación (por ejemplo,
	 * http://localhost:8080/).
	 * 
	 * - public String Login(Model modelo, @RequestParam(name = "RpError", required = false) String
	 * error, @RequestParam(name = "RpLogout",required = false) String logout):
	 *
	 * - public: Indica que el método es accesible desde cualquier parte del código.
	 * 
	 * - String: El tipo de dato que devuelve el método (en este caso, una cadena de texto).
	 *
	 * - Login: El nombre del método.
	 * 
	 * - Model modelo: Un parámetro de tipo Model, que se utiliza para pasar datos entre el controlador
	 * y la vista (plantilla HTML).
	 * 
	 * - @RequestParam(name = "RpError", required = false) String error: Aquí se utiliza la
	 * anotación @RequestParam para obtener un parámetro de la solicitud HTTP. En este caso, se espera
	 * un parámetro llamado RpError. Si no se proporciona, el valor será null.
	 * 
	 * - @RequestParam(name = "RpLogout",required = false) String logout: Similar al anterior, se espera
	 * un parámetro llamado RpLogout. Si no se proporciona, el valor también será null.
	 * 
	 * - modelo.addAttribute("MaaError", error);: Aquí se agrega un atributo llamado MaaError al modelo.
	 * El valor de este atributo será el valor del parámetro error que se obtiene de la solicitud.
	 *
	 * - modelo.addAttribute("MaaLogOut", logout);: Similar al anterior, se agrega un atributo llamado
	 * MaaLogOut al modelo con el valor del parámetro logout.
	 * 
	 * - modelo.addAttribute("MaaCredenciales", new Credenciales());: Se agrega un atributo llamado
	 * MaaCredenciales al modelo, y se le asigna una nueva instancia de la clase Credenciales.
	 * En resumen, el método Login se encarga de manejar las solicitudes GET a la raíz de la aplicación,
	 * y utiliza los parámetros RpError y RpLogout para agregar atributos al modelo. Estos atributos
	 * luego pueden ser utilizados en la vista (archivo HTML) para mostrar información al usuario.
	 * 
	 * 
	 * Podrían considerarse como metadatos en el contexto de programación:
	 * 
	 * - Nombres de parámetros y atributos: Los nombres como "RpError", "RpLogout", "MaaError",
	 * "MaaLogOut", y "MaaCredenciales" son metadatos. Estos nombres describen la función o el propósito
	 * de los parámetros y atributos en el método Login.
	 * 
	 * - Comentarios: Aunque no están presentes en el código que proporcionaste, los comentarios también
	 * pueden considerarse metadatos. Proporcionan información adicional sobre el código y su
	 * funcionamiento.
	 * 
	 * En resumen, aunque no hay metadatos explícitos en el código, los nombres de los parámetros y
	 * atributos actúan como metadatos al describir su función y contexto. 😊
	 * 
	 */




	@PostMapping("/check")
	public String Check(@ModelAttribute Credenciales credenciales) {

		// Logica para validar el usuario con parametyro de error
		if (credenciales.getNombre().equals("ivor") && credenciales.getPass().equals("")){
			return "redirect:/usuarios/list";
		}
		return "redirect:/login?RpError";

		/*
		 * El método Check tiene la anotación @PostMapping("/check"), lo que significa que se encarga de
		 * manejar las peticiones HTTP POST que llegan a la URL "/check". Esta anotación es una forma
		 * abreviada de @RequestMapping(method = RequestMethod.POST, value = "/check"), que indica el método
		 * y la ruta de la petición.
		 * 
		 * El método Check tiene un parámetro llamado credenciales, que es de tipo Credenciales. Este
		 * parámetro tiene la anotación @ModelAttribute, lo que significa que se vincula con un atributo del
		 * modelo que se llama igual.
		 * 
		 * El modelo es un objeto que contiene los datos que se quieren mostrar en la vista web.
		 *
		 * La anotación @ModelAttribute permite obtener los datos del modelo o crearlos si
		 * no existen, y rellenar sus campos con los valores que coincidan con los nombres de los parámetros
		 * de la petición. En este caso, se supone que la petición POST envía los datos de las credenciales
		 * de un usuario, como el nombre y la contraseña, y que la clase Credenciales tiene esos campos
		 *
		 * El método Check devuelve una cadena de texto que empieza por "redirect:", lo que significa que se
		 * trata de una redirección a otra URL. La URL a la que se redirige es "/login?RpError", que es la
		 * página de inicio de sesión con mensaje de error. No se especifica el motivo del
		 * error.
		 */

	}




}
