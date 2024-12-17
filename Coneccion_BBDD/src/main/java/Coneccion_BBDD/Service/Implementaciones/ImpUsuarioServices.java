package Coneccion_BBDD.Service.Implementaciones; // Define el paquete donde se encuentra esta clase

import java.util.List; // Importa la clase List de java.util para manejar listas

import org.springframework.beans.factory.annotation.Autowired; // Importa la anotación @Autowired de Spring
import org.springframework.beans.factory.annotation.Qualifier; // Importa la anotación @Qualifier de Spring
import org.springframework.stereotype.Service; // Importa la anotación @Service de Spring

import Coneccion_BBDD.Repository.ItfUsarioRepository; // Importa la interfaz ItfUsarioRepository
import Coneccion_BBDD.Service.ItfUsuarioService; // Importa la interfaz ItfUsuarioService
import Coneccion_BBDD.model.Usuario; // Importa la clase Usuario


@Service("itfUsuarioService") // Marca la clase como un servicio de Spring con el nombre "itfUsuarioService"
public class ImpUsuarioServices implements ItfUsuarioService { // Implementa la interfaz ItfUsuarioService

	@Autowired // Indica que Spring debe inyectar una instancia del bean ItfUsarioRepository
	@Qualifier("itfUsarioRepository") // Especifica cuál bean debe ser inyectado si hay más de uno
	private ItfUsarioRepository itfUsarioRepository; // Declaración del repositorio

	@Override // Indica que este método sobrescribe un método en la interfaz ItfUsuarioService
	public List<Usuario> listAllUsuario() {
		// Devuelve una lista de todos los usuarios encontrados en la base de datos
		return this.itfUsarioRepository.findAll();
	}

	@Override // Indica que este método sobrescribe un método en la interfaz ItfUsuarioService
	public Usuario addUsuario(Usuario usuario) {
		/*
		 * Devuelve el objeto usuario, después de guardarlo en la base de datos
		 * usando el método save() del repositorio itfUsarioRepository.
		 */
		return this.itfUsarioRepository.save(usuario);
	}

}


/*
 * @Service("itfUsuarioService") // Esta anotación indica que esta clase es un componente de Spring
 * que
 * provee la lógica de negocio o la manipulación de datos para la entidad Usuario
 * 
 * public class ImpUsuarioService implements ItfUsuarioService { // Esta línea indica que esta clase
 * implementa la interfaz ItfUsuarioService y por tanto debe definir los métodos que declara dicha
 * interfaz
 * 
 * @Autowired // Esta anotación indica que Spring se encarga de inyectar una instancia de la clase o
 * interfaz que se especifica a continuación
 * 
 * @Qualifier("itfUsarioRepository") // Esta anotación se usa para indicar el nombre del componente
 * que se quiere inyectar cuando hay más de uno que implementa la misma interfaz
 * 
 * private ItfUsarioRepository itfUsarioRepository; // Esta línea declara una variable de tipo
 * ItfUsarioRepository que se inicializa con la instancia inyectada por Spring. Esta variable se usa
 * para acceder a los métodos del repositorio de datos.
 * 
 * @Override // Esta anotación indica que el método que sigue es una redefinición de un método de la
 * interfaz que se implementa
 * 
 * public List<Usuario> listAllUsuario() { // Este método devuelve una lista de objetos de tipo
 * Usuario que representa todos los usuarios almacenados en el repositorio de datos
 * 
 * return this.itfUsarioRepository.findAll(); // Para ello, se usa el método findAll() del
 * repositorio, que devuelve una lista de todos los objetos de la entidad Usuario
 * }
 * 
 * @Override // Esta anotación indica que el método que sigue es una redefinición de un método de la
 * interfaz que se implementa
 * 
 * 
 * public Usuario addUsuario(Usuario usuario) { // Este método recibe un objeto de tipo Usuario como
 * parámetro y lo guarda en el repositorio de datos
 * 
 * return this.itfUsarioRepository.save(usuario); // Para ello, se usa el método save(usuario) del
 * repositorio, que recibe un objeto de la entidad Usuario y lo persiste en la base de datos. El
 * método devuelve el mismo objeto que se guardó
 * }
 * }
 */















