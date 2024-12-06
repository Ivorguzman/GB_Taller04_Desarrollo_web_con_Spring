package com.JavaListasEnPlantillasThymeleaf.model;

public class PersonaLista {

	private String nombre;
	private int telefono;


	// Contructor
	public PersonaLista(String nombre, int telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}




	public String getNombre() {
		return this.nombre;
	}


	public int getTelefono() {
		return this.telefono;
	}







}
