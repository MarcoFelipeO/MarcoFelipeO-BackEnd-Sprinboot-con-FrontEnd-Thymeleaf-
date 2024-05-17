package com.marco.com;

import com.marco.com.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectUnoApplication{


@Autowired
	private PersonaService personaService;

	public static void main(String[] args) {
		SpringApplication.run(ProjectUnoApplication.class, args);

	}
/*
	@Override
	public void run(String... args) throws Exception {
		personaService.crearPersona(new Persona(5L, "David",26));
		personaService.crearPersona(new Persona(6L, "Julian",26));
		personaService.crearPersona(new Persona(7L, "Andre",26));
		personaService.crearPersona(new Persona(8L, "Alejandro",26));


		//numero de personas
		System.out.println("Numero de personas de la tabla : " + personaService.contarPersonas());

		//lista de personass
		List<Persona> personas = personaService.obtenerTodas();
		personas.forEach(p -> System.out.println("Nombre de la persona :" + p.getNombre()));

	}*/
}
