package com.foro.alura.demo.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "TBcursos")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String categoria;

    public Curso(String nombre, String categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
    }
}
