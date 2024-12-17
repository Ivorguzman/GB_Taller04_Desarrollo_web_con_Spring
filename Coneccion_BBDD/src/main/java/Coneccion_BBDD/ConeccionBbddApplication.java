package Coneccion_BBDD; // Define el paquete donde se encuentra esta clase

import org.springframework.boot.SpringApplication; // Importa la clase SpringApplication de Spring Boot
import org.springframework.boot.autoconfigure.SpringBootApplication; // Importa la anotación @SpringBootApplication de Spring Boot

@SpringBootApplication // Marca esta clase como una aplicación Spring Boot
public class ConeccionBbddApplication { // Clase principal de la aplicación

	public static void main(String[] args) { // Método principal de la aplicación
		SpringApplication.run(ConeccionBbddApplication.class, args); // Inicia la aplicación Spring Boot
	}

}

/*
 * Explicación del Código:
 *
 * 1. **package Coneccion_BBDD**:
 * - Define el paquete donde se encuentra esta clase.
 * 
 * 2. **Imports**:
 * - `import org.springframework.boot.SpringApplication`: Importa la clase `SpringApplication`, que proporciona un método para arrancar la aplicación Spring.
 * - `import org.springframework.boot.autoconfigure.SpringBootApplication`: Importa la anotación `@SpringBootApplication`, que habilita varias características de Spring Boot.
 * 
 * 3. **@SpringBootApplication**:
 * - Esta anotación combina tres anotaciones importantes: `@Configuration`, `@EnableAutoConfiguration`, y `@ComponentScan`, lo que facilita la configuración automática de
 * Spring Boot.
 * 
 * 4. **Clase ConeccionBbddApplication**:
 * - Define la clase principal de la aplicación. Esta clase se utiliza para iniciar la aplicación Spring Boot.
 * 
 * 5. **Método main(String[] args)**:
 * - Es el punto de entrada de la aplicación. Dentro de este método, se llama a `SpringApplication.run(...)` para iniciar la aplicación Spring Boot.
 * - `SpringApplication.run(ConeccionBbddApplication.class, args)` inicia la aplicación, configurándola según las clases, métodos y configuraciones encontradas en el paquete
 * `Coneccion_BBDD` y sus subpaquetes.
 * 
 * En resumen, esta clase define una aplicación Spring Boot que se puede iniciar desde el método principal. Utiliza las características automáticas de Spring Boot para
 * configurar la aplicación y escanear los componentes necesarios.
 */
