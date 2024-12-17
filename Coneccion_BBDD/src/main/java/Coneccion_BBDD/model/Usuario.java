package Coneccion_BBDD.model; // Define el paquete donde se encuentra esta clase

import jakarta.persistence.Column; // Importa la anotación @Column de JPA
import jakarta.persistence.Entity; // Importa la anotación @Entity de JPA
import jakarta.persistence.GeneratedValue; // Importa la anotación @GeneratedValue de JPA
import jakarta.persistence.Id; // Importa la anotación @Id de JPA
import jakarta.persistence.Table; // Importa la anotación @Table de JPA

@Entity // Marca la clase como una entidad JPA
@Table(name = "usuario") // Especifica la tabla "usuario" en la base de datos
public class Usuario { // Representa la entidad Usuario

	@Id // Marca el campo como clave primaria
	@GeneratedValue // Genera automáticamente el valor del campo id
	@Column(name = "id") // Mapea el campo a la columna "id" en la tabla
	private int id; // Campo que representa la columna "id" en la base de datos

	@Column(name = "nombre", length = 50) // Mapea el campo a la columna "nombre" con longitud máxima de 50 caracteres
	private String nombre; // Campo que representa la columna "nombre" en la base de datos

	@Column(name = "apellidos", length = 50) // Mapea el campo a la columna "apellidos" con longitud máxima de 50 caracteres
	private String apellidos; // Campo que representa la columna "apellidos" en la base de datos

	@Column(name = "telefono", length = 13) // Mapea el campo a la columna "telefono" con longitud máxima de 13 caracteres
	private String telefono; // Campo que representa la columna "telefono" en la base de datos

	@Column(name = "correo", length = 100) // Mapea el campo a la columna "correo" con longitud máxima de 100 caracteres
	private String correo; // Campo que representa la columna "correo" en la base de datos

	@Column(name = "direccion", length = 150) // Mapea el campo a la columna "direccion" con longitud máxima de 150 caracteres
	private String direccion; // Campo que representa la columna "direccion" en la base de datos

	// Constructor con parámetros
	public Usuario(int id, String nombre, String apellidos, String telefono, String correo, String direccion) {
		this.id = id; // Asigna el valor del parámetro id al campo id
		this.nombre = nombre; // Asigna el valor del parámetro nombre al campo nombre
		this.apellidos = apellidos; // Asigna el valor del parámetro apellidos al campo apellidos
		this.telefono = telefono; // Asigna el valor del parámetro telefono al campo telefono
		this.correo = correo; // Asigna el valor del parámetro correo al campo correo
		this.direccion = direccion; // Asigna el valor del parámetro direccion al campo direccion
	}

	// Constructor sin parámetros
	public Usuario( ) {
		// Constructor vacío requerido por JPA
	}

	// Getter para el campo id
	public int getId() {
		return this.id; // Retorna el valor del campo id
	}

	// Setter para el campo id
	public void setId(int id) {
		this.id = id; // Asigna el valor del parámetro id al campo id
	}

	// Getter para el campo nombre
	public String getNombre() {
		return this.nombre; // Retorna el valor del campo nombre
	}

	// Setter para el campo nombre
	public void setNombre(String nombre) {
		this.nombre = nombre; // Asigna el valor del parámetro nombre al campo nombre
	}

	// Getter para el campo apellidos
	public String getApellidos() {
		return this.apellidos; // Retorna el valor del campo apellidos
	}

	// Setter para el campo apellidos
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos; // Asigna el valor del parámetro apellidos al campo apellidos
	}

	// Getter para el campo telefono
	public String getTelefono() {
		return this.telefono; // Retorna el valor del campo telefono
	}

	// Setter para el campo telefono
	public void setTelefono(String telefono) {
		this.telefono = telefono; // Asigna el valor del parámetro telefono al campo telefono
	}

	// Getter para el campo correo
	public String getCorreo() {
		return this.correo; // Retorna el valor del campo correo
	}

	// Setter para el campo correo
	public void setCorreo(String correo) {
		this.correo = correo; // Asigna el valor del parámetro correo al campo correo
	}

	// Getter para el campo direccion
	public String getDireccion() {
		return this.direccion; // Retorna el valor del campo direccion
	}

	// Setter para el campo direccion
	public void setDireccion(String direccion) {
		this.direccion = direccion; // Asigna el valor del parámetro direccion al campo direccion
	}

}


/*
 * La palabra clave import indica que se importan clases o paquetes que se necesitan para usar JPA.
 * 
 * En este caso, se importan las clases Column, Entity, GeneratedValue, Id y Table del paquete
 * jakarta.persistence, que son anotaciones de JPA que sirven para definir el mapeo entre la clase y
 * la tabla de la base de datos.
 * La anotación @Entity indica que esta clase es una entidad, es decir, que se puede persistir en
 * una base de datos usando JPA. Esta anotación es obligatoria para que JPA reconozca la clase como
 * una entidad.
 * 
 * La anotación @Table(name = "usuario") indica que esta clase se mapea con la tabla llamada
 * “usuario” en la base de datos. Si no se especifica esta anotación, JPA asume que el nombre de la
 * tabla es el mismo que el nombre de la clase.
 * 
 * El nombre Usuario es el identificador de la clase, que debe seguir las convenciones de Java para
 * los nombres de las clases. Por lo general, se usa una letra mayúscula al inicio y se usa el
 * formato camelCase para separar las palabras.
 * 
 * Las llaves {} delimitan el cuerpo de la clase, donde se declaran los atributos y los métodos de
 * la clase.
 * 
 * La anotación @Id indica que el atributo que sigue es la clave primaria de la entidad, es decir,
 * el identificador único que distingue a cada objeto de esta clase. Esta anotación es obligatoria
 * para que JPA pueda gestionar la entidad.
 * 
 * La anotación @GeneratedValue indica que el valor de la clave primaria se genera automáticamente
 * por la base de datos, por ejemplo, usando un campo autoincremental.
 * Esta anotación es opcional, pero recomendable para evitar tener que asignar manualmente el valor
 * de la clave primaria.
 * 
 * La anotación @Column(name = "id") indica que este atributo se mapea con la columna llamada “id”
 * en la tabla de la base de datos. Si no se especifica esta anotación, JPA asume que el nombre de
 * la columna es el mismo que el nombre del atributo.
 * 
 * El tipo de dato int indica que este atributo es un número entero, que debe coincidir con el tipo
 * de dato de la columna correspondiente en la base de datos.
 * 
 * El nombre id es el identificador del atributo, que debe seguir las convenciones de Java para los
 * nombres de los atributos. Por lo general, se usa una letra minúscula al inicio y se usa el
 * formato camelCase para separar las palabras.
 * 
 * El modificador private indica que este atributo es privado, es decir, que solo se puede acceder a
 * él desde la misma clase. Esto es una buena práctica para encapsular los datos y evitar que se
 * modifiquen directamente desde otras clases.
 * 
 * El resto de los atributos siguen el mismo patrón que el atributo id, con la diferencia de que
 * tienen el tipo de dato String, que representa una cadena de caracteres, y que tienen un atributo
 * length en la anotación @Column, que indica la longitud máxima de la cadena que se puede almacenar
 * en la base de datos.
 * 
 * El constructor public Usuario(int id, String nombres, String apellidos, String telefono, String
 * correo, String direccion) es un método especial que se usa para crear objetos de esta clase,
 * asignando los valores de los parámetros a los atributos de la clase. Este constructor es
 * opcional, pero útil para crear objetos con todos los datos necesarios.
 * 
 * El constructor public Usuario() es un método especial que se usa para crear objetos de esta clase
 * sin asignar ningún valor a los atributos de la clase.
 * Este constructor es obligatorio para que JPA pueda crear objetos de esta clase sin necesidad de
 * conocer los valores de los atributos.
 * 
 * Los métodos public int getId(), public void setId(int id), public String getNombres(), public
 * void setNombres(String nombres), etc. son métodos que se usan para acceder y modificar los
 * valores de los atributos de la clase. Estos métodos se llaman getters y setters, y siguen el
 * patrón de nombrarlos como get o set seguido del nombre del atributo con la primera letra en
 * mayúscula. Estos métodos son obligatorios para que JPA pueda leer y escribir los valores de los
 * atributos de la clase.
 */


