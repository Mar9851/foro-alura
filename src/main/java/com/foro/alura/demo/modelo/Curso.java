package com.foro.alura.demo.modelo;

import com.foro.alura.demo.records.DatosCurso;
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
    @Column(name = "curso_id")
    private Long id;
    private String nombre;
    private String categoria;


    public Curso(DatosCurso curso) {
        this.nombre= curso.nombre();
        this.categoria= curso.categoria();
    }

    public Curso(Curso curso) {
    }
}
