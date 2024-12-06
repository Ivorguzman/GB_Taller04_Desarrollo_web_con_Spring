package validacion_formulario.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // Anotacion de jpa
@Table(name = "Estudiante") // Anotacion de jpa
public class Estudiante { // representa el nombre de la tabla en la base de datos

	@Id
	@GeneratedValue // Genera automaticamente el numero continuo del id
	@Column(name = "id")
	private int id;// representa la columna en la base de datos


	@Column(name = "nombre", length = 50)
	private String nombre;// representa la columna en la base de datos


	@Column(name = "apellidos", length = 50)
	private String apellidos;// representa la columna en la base de datos


	@Column(name = "edad", length = 2)
	private int edad;// representa la columna en la base de datos


	@Column(name = "curso", length = 15)
	private String telefono;// representa la columna en la base de datos



	// ******* Contructor Firma 5 paramaetros ********
	public Estudiante(int id, String nombre, String apellidos, int edad, String telefono) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.telefono = telefono;
	}




	// ******* Seters *******
	public String getNombre() {
		return this.nombre;
	}


	public String getApellidos() {
		return this.apellidos;
	}


	public int getEdad() {
		return this.edad;
	}


	public String getTelefono() {
		return this.telefono;
	}






	// ******* Getters *******
	public void setId(int id) {
		this.id = id;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}

