package aplicacionWeb.model.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aplicacionWeb.model.entity.EntityUsuarios;



/*
 * la interfaz Serializable es una etiqueta que le dice a Java que los objetos de una clase pueden
 * ser convertidos a una secuencia de bytes y viceversa. Esto es útil para guardar el estado de un
 * objeto en un archivo o enviarlo a través de una red. Sin embargo, es importante asegurarse de que
 * los datos que se deserializan sean seguros y no provengan de una fuente maliciosa, ya que esto
 * podría comprometer la seguridad de la aplicación. Por eso, se recomienda usar filtros de
 * serialización como medida de protección.
 * 
 * - ItfUsuarioRepository: Es el nombre de la interfaz del repositorio.
 * 
 * - extends JpaRepository<EntityUsuarios, Serializable>: Esto significa que ItfUsuarioRepository
 * extiende JpaRepository, que es una interfaz de Spring Data JPA. Al hacerlo, ItfUsuarioRepository
 * hereda varios métodos para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en la
 * entidad EntityUsuarios.
 * 
 * - EntityUsuarios (Clase Java): Es el tipo de la entidad JPA que representa la tabla de usuarios
 * en la base de
 * datos.
 * 
 * - Serializable: Es la clase de la clave primaria de EntityUsuarios. Al usar Serializable aquí, se
 * indica que la clave primaria puede ser de cualquier tipo que implemente la interfaz Serializable.
 * la clave primaria de la entidad EntityUsuarios no está restringida a un tipo de dato específico
 * como int, long, String, etc. Al especificar Serializable como el tipo de la clave primaria en la
 * interfaz del repositorio, se permite que cualquier tipo de objeto que implemente la interfaz
 * Serializable pueda ser utilizado como clave primaria.
 * Por lo tanto, al usar Serializable en el contexto de una clave primaria, se está diciendo que la
 * clave primaria puede ser cualquier objeto que pueda ser serializado. Esto ofrece flexibilidad en
 * la definición del modelo de datos, permitiendo que la clave primaria sea un tipo compuesto o
 * incluso un tipo personalizado, siempre y cuando ese tipo pueda ser serializado.
 * 
 * - findById(int id): Es un método que se declara explícitamente para encontrar una entidad
 * EntityUsuarios por su identificador único (ID). Aunque JpaRepository ya proporciona un método
 * findById, declararlo explícitamente puede ser útil para personalizar su comportamiento o para
 * proporcionar claridad en el código.
 * 
 * En resumen, esta interfaz de repositorio permite interactuar con la base de datos para realizar
 * operaciones en la tabla de usuarios, y el método findById se utiliza para buscar un usuario
 * específico por su ID.
 */
@Repository("itfUsuarioRepository") // declara el bean
public interface ItfUsuarioRepository extends JpaRepository<EntityUsuarios, Serializable> {


	//
	public EntityUsuarios findById(int id);
}









