package Coneccion_BBDD.Service.Implementaciones; // Define el paquete donde se encuentra esta clase

import java.util.List; // Importa la clase List de java.util para manejar listas

import org.springframework.beans.factory.annotation.Autowired; // Importa la anotación @Autowired de Spring
import org.springframework.beans.factory.annotation.Qualifier; // Importa la anotación @Qualifier de Spring
import org.springframework.stereotype.Service; // Importa la anotación @Service de Spring

import Coneccion_BBDD.Repository.Itf_UsarioRepository; // Importa la interfaz ItfUsarioRepository
import Coneccion_BBDD.Service.Itf_UsuarioService; // Importa la interfaz ItfUsuarioService
import Coneccion_BBDD.model.Usuario; // Importa la clase Usuario

// @Service("itf_UsuarioService"):La clase implementa la interfaz Itf_UsuarioService y se anota con @Service, lo que indica que es un bean de servicio gestionado por
// Spring.@Service hace que Spring registre esta clase como un bean, permitiendo su inyección en otros componentes del sistema.
@Service("itf_UsuarioService")
public class ImpUsuarioServices implements Itf_UsuarioService { // Implementa la interfaz Itf_UsuarioService

	@Autowired // Indica que Spring debe inyectar una instancia del bean Itf_UsuarioService
	@Qualifier("itfUsarioRepository") // Especifica cuál bean debe ser inyectado si hay más de uno
	private Itf_UsarioRepository itfUsuarioRepository; // Declaración del repositorio

	@Override // Indica que este método sobrescribe un método en la interfaz Itf_UsuarioService
	public List<Usuario> listAllUsuario() {
		// Devuelve una lista de todos los usuarios encontrados en la base de datos
		return this.itfUsuarioRepository.findAll();
	}

	@Override // Indica que este método sobrescribe un método en la interfaz ItfUsuarioService
	public Usuario addUsuario(Usuario usuario) {
		/*
		 * Devuelve el objeto usuario, después de guardarlo en la base de datos
		 * usando el método save() del repositorio itfUsarioRepository.
		 */
		return this.itfUsuarioRepository.save(usuario);
	}

}


















