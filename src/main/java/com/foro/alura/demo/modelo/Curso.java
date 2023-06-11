package com.foro.alura.demo.modelo;

import com.foro.alura.demo.records.DatosRegistroCurso;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "TBcursos")@Getter
@Setter
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@NoArgsConstructor
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String categoria;


    public Curso(DatosRegistroCurso datosRegistroCurso) {
        this.nombre= datosRegistroCurso.nombre();
        this.categoria= datosRegistroCurso.categoria();
    }

    public Curso(Curso curso) {
    }
}
