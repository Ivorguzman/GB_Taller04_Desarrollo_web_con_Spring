package aplicacionWeb.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class EntityUsuarios {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "nombre", length = 50)
	private String nombre;

	@Column(name = "apellidos", length = 50)
	private String apellidos;

	@Column(name = "telefono", length = 13)
	private String telefono;

	@Column(name = "correo", length = 100)
	private String correo;

	@Column(name = "direccion", length = 150)
	private String direccion;




	public EntityUsuarios(int id, String nombre, String apellidos, String telefono, String correo, String direccion) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.correo = correo;
		this.direccion = direccion;


	}


	public EntityUsuarios( ) {




	}


	public int getId() {
		return this.id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return this.nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return this.apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getTelefono() {
		return this.telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getCorreo() {
		return this.correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getDireccion() {
		return this.direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
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





















