package com.marco.com.controller;

import com.marco.com.entities.Persona;
import com.marco.com.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;


    @GetMapping
    public String listarPersonas(Model model){ // la clase model se utiliza para transferir objetos
                                                // del controller a la vista
        List<Persona> personas = personaService.obtenerTodas();
        model.addAttribute("listaPersonas",personas); //key-valor
        return "listar";
    }

    @GetMapping("/nueva")
    public String mostrarFormularioDeNuevaPersona(Model model){
        model.addAttribute("persona", new Persona());
        model.addAttribute("accion", "");
        return "formulario";
    }

    @PostMapping("/nueva")
    public String guardarNuevaPersona(@ModelAttribute Persona persona){
    personaService.crearPersona(persona);
    return "redirect:/personas";
    }

}
