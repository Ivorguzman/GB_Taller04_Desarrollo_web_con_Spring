package Servicios.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import Servicios.model.PaisCapital;
import Servicios.service.Impl.SegundoServiceImpl;

@Controller
@RequestMapping("/")
public class serviceController_2 {


	@Autowired
	@Qualifier("segundoServiceImpl")
	private SegundoServiceImpl valorInjectar;


	@GetMapping("/paisesCapitales")
	public String ListadoPaisesCapitales(Model modelo) {
		Map<String, PaisCapital> paisConCapital = this.valorInjectar.getCapitaPais(); // obtener el map
		modelo.addAttribute(paisConCapital); // agregar el map al modelo



		for (String clave : paisConCapital.keySet()){
			System.out.println(clave); // imprimir la clave
			System.out.print("Pais :" + paisConCapital.get(clave).getPais() + " - Capital :");
			System.out.println(paisConCapital.get(clave).getCapital());
		}



		/*
		 * Iterable<String> clave = paisConCapital.keySet();
		 * System.out.println(clave);
		 * System.out.println(paisConCapital.get("p-1").getPais());
		 * System.out.println(paisConCapital.get("p-1").getCapital());
		 */
		






		return "paisescapitales.html";

	}




	/*
	 * la, veo que quieres hacer una iteración con un map en Java. El código que has compartido tiene
	 * algunos errores que te voy a explicar:
	 * 
	 * No puedes iterar sobre un map directamente, sino sobre su conjunto de entradas (entrySet), su
	 * conjunto de claves (keySet) o su colección de valores (values).
	 * Si iteras sobre el entrySet, obtendrás objetos de tipo Map.Entry que tienen los métodos getKey y
	 * getValue para acceder a la clave y al valor de cada entrada.
	 * Si iteras sobre el keySet, obtendrás objetos de tipo String que son las claves del map, y tendrás
	 * que usar el método get del map para obtener el valor asociado a cada clave.
	 * Si iteras sobre el values, obtendrás objetos de tipo PaisCapital que son los valores del map, y
	 * no tendrás acceso a las claves.
	 * En cualquier caso, debes usar un bucle for-each o un iterador para recorrer el conjunto o la
	 * colección que elijas.
	 * En el código que has compartido, usas una variable paisCapital que no está definida, y que no
	 * corresponde con el tipo de dato que obtienes al iterar sobre el map.
	 * Para corregir el código, puedes usar cualquiera de estas opciones:
	 * 
	 * Iterar sobre el entrySet:
	 * Java
	 * 
	 * @GetMapping("/paisesCapitales")
	 * public String ListadoPaisesCapitales(Model modelo) {
	 * Map<String, PaisCapital> paisesCapitales = this.segundoServiceImpl.getCapitaPais(); // obtener el
	 * map
	 * modelo.addAllAttributes(paisesCapitales); // agregar el map al modelo
	 * 
	 * for(Map.Entry<String, PaisCapital> entrada: paisesCapitales.entrySet()) {
	 * System.out.println(entrada.getKey()); // imprimir la clave
	 * System.out.println(entrada.getValue().getPais()); // imprimir el país
	 * System.out.println(entrada.getValue().getCapital()); // imprimir la capital
	 * }
	 * 
	 * return "paisescapitales.html";
	 * }
	 * Código generado por IA. Revisar y usar cuidadosamente. Más información sobre preguntas
	 * frecuentes.
	 * Iterar sobre el keySet:
	 * Java
	 * 
	 * @GetMapping("/paisesCapitales")
	 * public String ListadoPaisesCapitales(Model modelo) {
	 * Map<String, PaisCapital> paisesCapitales = this.segundoServiceImpl.getCapitaPais(); // obtener el
	 * map
	 * modelo.addAllAttributes(paisesCapitales); // agregar el map al modelo
	 * 
	 * for(String clave: paisesCapitales.keySet()) {
	 * System.out.println(clave); // imprimir la clave
	 * System.out.println(paisesCapitales.get(clave).getPais()); // imprimir el país
	 * System.out.println(paisesCapitales.get(clave).getCapital()); // imprimir la capital
	 * }
	 * 
	 * return "paisescapitales.html";
	 * }
	 * Código generado por IA. Revisar y usar cuidadosamente. Más información sobre preguntas
	 * frecuentes.
	 * Iterar sobre el values:
	 * Java
	 * 
	 * @GetMapping("/paisesCapitales")
	 * public String ListadoPaisesCapitales(Model modelo) {
	 * Map<String, PaisCapital> paisesCapitales = this.segundoServiceImpl.getCapitaPais(); // obtener el
	 * map
	 * modelo.addAllAttributes(paisesCapitales); // agregar el map al modelo
	 * 
	 * for(PaisCapital valor: paisesCapitales.values()) {
	 * System.out.println(valor.getPais()); // imprimir el país
	 * System.out.println(valor.getCapital()); // imprimir la capital
	 * }
	 * 
	 * return "paisescapitales.html";
	 * }
	 */

}
