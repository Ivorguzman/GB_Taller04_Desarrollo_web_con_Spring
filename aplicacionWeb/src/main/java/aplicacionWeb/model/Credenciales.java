package aplicacionWeb.model;

public class Credenciales {

	private String nombre;
	private String pass;


	public Credenciales(String nombre, String pass) {
		this.nombre = nombre;
		this.pass = pass;
	}


	public Credenciales( ) {

	}


	public String getNombre() {
		return this.nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getPass() {
		return this.pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}





}
