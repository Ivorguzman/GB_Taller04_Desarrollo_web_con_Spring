package com.JavaListasEnPlantillasThymeleaf.model; // Paquete que contiene la clase PersonaLista

public class PersonaLista { // Definición de la clase PersonaLista

    private String nombre; // Variable de instancia para almacenar el nombre
    private int telefono; // Variable de instancia para almacenar el teléfono

    // Constructor
    public PersonaLista(String nombre, int telefono) { // Constructor de la clase PersonaLista
        this.nombre = nombre; // Asigna el nombre pasado como parámetro al atributo de la clase
        this.telefono = telefono; // Asigna el teléfono pasado como parámetro al atributo de la clase
    }

    // Método para obtener el nombre
    public String getNombre() {
        return this.nombre; // Devuelve el valor del atributo nombre
    }

    // Método para obtener el teléfono
    public int getTelefono() {
        return this.telefono; // Devuelve el valor del atributo telefono
    }

}

/*
 * 
 * Explicación a nivel de bloque y flujo de ejecución:
 * 
 * Paquete y clase:
 * 
 * package com.JavaListasEnPlantillasThymeleaf.model;: Define el paquete donde reside la clase PersonaLista.
 * 
 * public class PersonaLista { ... }: Define la clase PersonaLista como pública, lo que significa que puede ser accedida desde otras clases.
 * 
 * 
 * 
 * Atributos:
 * 
 * private String nombre;: Declara un atributo privado nombre de tipo String.
 * 
 * private int telefono;: Declara un atributo privado telefono de tipo int.
 * 
 * 
 * 
 * Constructor:
 * 
 * public PersonaLista(String nombre, int telefono) { ... }: Define un constructor que toma dos parámetros (nombre y telefono) y los asigna a los atributos de la clase.
 * 
 * this.nombre = nombre;: Asigna el parámetro nombre al atributo nombre de la instancia.
 * 
 * this.telefono = telefono;: Asigna el parámetro telefono al atributo telefono de la instancia.
 * 
 * 
 * 
 * Métodos:
 * 
 * public String getNombre() { ... }: Método público que devuelve el valor del atributo nombre.
 * 
 * return this.nombre;: Retorna el valor del atributo nombre.
 * 
 * public int getTelefono() { ... }: Método público que devuelve el valor del atributo telefono.
 * 
 * return this.telefono;: Retorna el valor del atributo telefono.
 * 
 * 
 * 
 * Flujo de ejecución:
 * Instanciación de la clase:
 * 
 * Cuando se crea una nueva instancia de PersonaLista, se llama al constructor con los parámetros nombre y telefono.
 * 
 * Los valores pasados como parámetros se asignan a los atributos correspondientes de la instancia.
 * 
 * Acceso a los atributos:
 * 
 * Para obtener el nombre, se llama al método getNombre(), que devuelve el valor del atributo nombre.
 * 
 * Para obtener el telefono, se llama al método getTelefono(), que devuelve el valor del atributo telefono.
 * 
 * Este flujo asegura que los atributos nombre y telefono se inicialicen correctamente y se puedan acceder de manera controlada a través de los métodos getNombre() y
 * getTelefono().
 */
