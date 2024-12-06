package com.ComoHacerPeticionesPost.model;

public class Persona {

	private String nombre;
	private int telefono;


	// Contructor
	public Persona(String nombre, int telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}


	public Persona( ) {
		System.out.println(this.nombre);
		System.out.println(this.telefono);
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}





	public String getNombre() {
		return this.nombre;
	}


	public int getTelefono() {
		return this.telefono;
	}



}
