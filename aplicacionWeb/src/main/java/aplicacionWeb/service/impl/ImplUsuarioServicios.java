package aplicacionWeb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import aplicacionWeb.model.entity.EntityUsuarios;
import aplicacionWeb.model.repository.ItfUsuarioRepository;
import aplicacionWeb.service.ItfUsuariosService;

@Service("implUsuarioServicios")
public class ImplUsuarioServicios implements ItfUsuariosService {

	/*
	 * @Autowired Crear una instancia de ItfUsuarioRepository usando el operador new
	 * Asignar esa instancia a un atributo de la clase que contiene el método AbstAddUsuarios.
	 * Implementar el método AbstAddUsuarios usando la instancia del atributo para invocar el método
	 * save.
	 * 
	 * 
	 * Estas dos líneas usan las anotaciones @Autowired y @Qualifier para inyectar una instancia de la
	 * interfaz ItfUsuarioRepository en el atributo itfUsuarioRepository de la clase
	 * public class ImplUsuarioServicios implements ItfUsuariosService{..}
	 * La anotación @Autowired le dice a Spring que busque un bean que coincida con el tipo de
	 * la interfaz.@Repository("itfUsuarioREpository").
	 * La anotación @Qualifier le dice que use el bean con el nombre "itfUsuarioREpository", que debe
	 * estar definido con la anotación @Repository("itfUsuarioREpository").
	 */
	@Autowired
	@Qualifier("itfUsuarioRepository")



	private ItfUsuarioRepository itfUsuarioRepository;




	/*
	 * Estas dos líneas implementan el método AbstAddUsuarios que recibe un objeto de tipo
	 * EntityUsuarios y lo guarda en la base de datos usando el método save de la interfaz
	 *
	 * - La anotación @Override indica que este método sobrescribe un método de una clase o interfaz
	 * superior. Esto significa que este método implementa o modifica el comportamiento de un método
	 * abstracto o virtual que se define en otra parte.
	 * 
	 * - El tipo de retorno EntityUsuarios indica que este método devuelve una instancia de la clase
	 * EntityUsuarios, que el la clase que representa lqa entidad de datos. Una entidad es una clase que
	 * se mapea con una tabla de la base de datos y que contiene los datos que se quieren almacenar o
	 * recuperar.
	 * 
	 * - El nombre del método AbstAddUsuarios es el que se le ha dado al método, y debe coincidir con el
	 * nombre del método que se sobrescribe. El nombre del método debe seguir las convenciones de
	 * nomenclatura de Java, que recomiendan usar verbos en camel case para los métodos.
	 * 
	 * - El parámetro (EntityUsuarios entityUsuarios) indica que este método recibe un argumento de tipo
	 * EntityUsuarios, que se llama entityUsuarios dentro del método. Este argumento es la entidad que
	 * se quiere guardar en la base de datos.
	 * 
	 * - El cuerpo del método { return this.itfUsuarioRepository.save(entityUsuarios); } contiene la
	 * instrucción que se ejecuta cuando se llama al método. En este caso, solo hay una instrucción, que
	 * es un return. Un return devuelve el valor que se indica después de la palabra clave, y termina la
	 * ejecución del método.
	 * 
	 * - El valor que se devuelve es this.itfUsuarioRepository.save(entityUsuarios), que es el resultado
	 * de llamar al método save del objeto itfUsuarioRepository, pasándole como argumento el parámetro
	 * entityUsuarios. El objeto itfUsuarioRepository es un atributo de la clase que contiene este
	 * método(public interface ItfUsuarioRepository extends JpaRepository<EntityUsuarios, Serializable>
	 * ), y es una instancia de una clase o interfaz que implemente el patrón repositorio.
	 * 
	 * NOTA:
	 * Un repositorio es una clase que encapsula la lógica de acceso a datos, y que usa Entity Framework
	 * Core para interactuar con la base de datos. El método save debe ser un método que usa Entity
	 * Framework Core para insertar o actualizar la entidad en la base de datos, y que devuelve la
	 * entidad guardada.
	 * 
	 * .
	 */
	@Override
	// Guardar un nuevo usuario o actualizar uno existente en la base de datos y devolver la entidad
	// guardada.
	public EntityUsuarios AddUsuarios(EntityUsuarios entityUsuarios) {

		return this.itfUsuarioRepository.save(entityUsuarios);

	}




	@Override
	// Recupera y devuelve una lista de todos los usuarios de la base de datos:
	public List<EntityUsuarios> ListAllUsuarios() {

		List<EntityUsuarios> users = new ArrayList<>();

		users = this.itfUsuarioRepository.findAll();

		return users;
	}

	@Override
	// Busca y devuelve un usuario po r su ID de la base de datos por medio de la entity.
	public EntityUsuarios findEntityUsuariosById(int id) {

		return this.itfUsuarioRepository.findById(id);
	}

	@Override
	public void removeEntityUsuariosById(int id) {

		EntityUsuarios us = this.findEntityUsuariosById(id);

		
		if (null != us){

			this.itfUsuarioRepository.delete(us);
		}
	}


}




















