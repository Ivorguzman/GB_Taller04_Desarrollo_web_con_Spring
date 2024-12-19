package Coneccion_BBDD.Service; // Define el paquete donde se encuentra esta interfaz

import java.util.List; // Importa la clase List de java.util para manejar listas

import Coneccion_BBDD.model.Usuario; // Importa la clase Usuario

public interface I_UsuarioService { // Define una interfaz pública llamada ItfUsuarioService

	// Método para listar todos los usuarios
	public abstract List<Usuario> listAllUsuario();
	// Declara un método abstracto que devuelve una lista de objetos Usuario

	// Método para añadir un nuevo usuario
	public abstract Usuario addUsuario(Usuario usuario);
	// Declara un método abstracto que acepta un objeto Usuario y devuelve un objeto Usuario

}

/*
 * Este código es un ejemplo de una interfaz en Java, que es una colección de métodos abstractos que
 * definen un comportamiento común para una clase o un tipo. En este caso, la interfaz se llama
 * ItfUsuarioService y define el comportamiento de un servicio para la entidad Usuario.
 * 
 * La palabra clave public indica que la interfaz es accesible desde cualquier otra clase o paquete.
 * La palabra clave interface indica que se trata de una interfaz y no de una clase.
 * 
 * El nombre ItfUsuarioService es el identificador de la interfaz, que debe seguir las convenciones
 * de Java para los nombres de las interfaces. Por lo general, se usa una letra mayúscula al inicio
 * y se usa el prefijo Itf para indicar que es una interfaz.
 * 
 * Las llaves {} delimitan el cuerpo de la interfaz, donde se declaran los métodos abstractos que
 * debe implementar cualquier clase que implemente esta interfaz.
 * 
 * La palabra clave abstract indica que los métodos de la interfaz son abstractos, es decir, que no
 * tienen una implementación definida y que deben ser implementados por las clases que implementen
 * esta interfaz.
 * 
 * El tipo de retorno List<Usuario> indica que los métodos devuelven una lista de objetos de tipo
 * Usuario, que es una clase que representa la entidad Usuario.
 * 
 * El nombre listAllUsuario y addUsuario son los identificadores de los métodos, que deben seguir
 * las convenciones de Java para los nombres de los métodos. Por lo general, se usa una letra
 * minúscula al inicio y se usa el formato camelCase para separar las palabras.
 * 
 * Los paréntesis () delimitan los parámetros de los métodos, que son las variables que se pasan
 * como entrada a los métodos. En este caso, el método listAllUsuario() no tiene ningún parámetro,
 * mientras que el método addUsuario(Usuario usuario) tiene un parámetro de tipo Usuario y nombre
 * usuario.
 * 
 * El punto y coma ; indica el final de la declaración de los métodos abstractos.
 */
