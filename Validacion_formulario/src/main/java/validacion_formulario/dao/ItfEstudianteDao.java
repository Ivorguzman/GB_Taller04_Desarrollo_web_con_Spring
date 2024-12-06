package validacion_formulario.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import validacion_formulario.entity.Estudiante;

// Accesses data object DAO

// JpaRepository<Entity, tipo de data clave primaria (Serializable)>
public interface ItfEstudianteDao extends JpaRepository<Estudiante, Serializable> {

}
