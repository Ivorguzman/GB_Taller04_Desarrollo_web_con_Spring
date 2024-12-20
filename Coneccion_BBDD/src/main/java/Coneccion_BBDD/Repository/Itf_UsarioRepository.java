package Coneccion_BBDD.Repository; // Define el paquete donde se encuentra esta clase

import java.io.Serializable; // Importa la interfaz Serializable de java.io

import org.springframework.data.jpa.repository.JpaRepository; // Importa la interfaz JpaRepository de Spring Data JPA
import org.springframework.stereotype.Repository; // Importa la anotación @Repository de Spring

import Coneccion_BBDD.model.Usuario; // Importa la clase Usuario


// Esta interfaz extiende JpaRepository y se anota con @Repository, indicando que es un componente de repositorio
// que interactúa con la base de datos.La anotación @Repository hace que Spring detecte esta interfaz como un bean,
// gestionando su ciclo de vida y permitiendo su inyección.
@Repository("itfUsuarioRepository")
public interface Itf_UsarioRepository extends JpaRepository<Usuario, Serializable> {

}

/*
 * Esto significa que Itf_UsarioRepository es una interfaz que extiende la interfaz JpaRepository,
 * que es una de las interfaces principales de Spring Data JPA. JpaRepository proporciona métodos
 * para realizar operaciones básicas de persistencia con entidades, como guardar, actualizar,
 * eliminar, contar y buscar por identificador.
 * 
 * En este caso, el primer argumento de JpaRepository es Usuario, que es la clase de la entidad que
 * se va a gestionar. El segundo argumento es Serializable, que es el tipo del identificador de la
 * entidad. Al usar Serializable, se permite que el identificador pueda ser de cualquier tipo que
 * implemente la interfaz Serializable, como String, Long, Integer, etc.
 * 
 * Al extender JpaRepository, Itf_UsarioReposito hereda todos los métodos de esa interfaz y puede
 * definir métodos adicionales según las necesidades del dominio. Por ejemplo, se podría definir un
 * método para buscar usuarios por nombre, correo electrónico o rol.
 * 
 * La anotación @Repository("itfUsarioRepository") indica que la interfaz I_UsarioRepository es una
 * clase que actúa como un repositorio de datos para la entidad Usuario.
 * 
 * Esta interfaz extiende de JpaRepository<Usuario, Serializable>, que es una interfaz genérica de
 * Spring Data JPA que proporciona métodos básicos para operaciones CRUD (crear, leer, actualizar
 * y borrar) con la base de datos. Al usar esta anotación, se le asigna el nombre "Itf_UsarioRepository"
 * al bean que se crea a partir de esta interfaz, lo que permite inyectarlo en otras clases usando
 *
 * @Autowired o @Resource.
 * 
 * La anotación @Repository también habilita la traducción automática de las excepciones específicas
 * de la persistencia a las excepciones de Spring DataAccessException.
 */















