package aplicacionWeb.service;

import java.util.List;

import aplicacionWeb.model.entity.EntityUsuarios;

public interface ItfUsuariosService {

	// Metodo para añadir Los contactos
	public EntityUsuarios AddUsuarios(EntityUsuarios usuarios);

	// Metodopara listar usuarios
	public List<EntityUsuarios> ListAllUsuarios();


	// Metodo para econtrar Usuarios
	public EntityUsuarios findEntityUsuariosById(int id);


	// Metodo para eleiminar Usuario
	public void removeEntityUsuariosById(int id);


}
















