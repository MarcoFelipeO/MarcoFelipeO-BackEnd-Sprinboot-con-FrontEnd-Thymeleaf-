package com.marco.com.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_personas")
@Data //para getter y setters
@AllArgsConstructor //CONSTRUCTOR CON TODOS LOS CAMPOS
@NoArgsConstructor //CONSTRUCTOR SIN LOS CAMPOS
public class Persona {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private int edad;



}
