package com.foro.alura.demo.modelo;

import com.foro.alura.demo.records.DatosRegistroTopico;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name="TBtopicos")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@NoArgsConstructor
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDateTime fechaCreacion = LocalDateTime.now();
    private StatusTopico status = StatusTopico.NO_RESPONDIDO;
    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario usuario;
    @ManyToOne(fetch = FetchType.LAZY)
    private Curso curso;
    //@OneToMany
    //private List<Respuesta> respuestas = new ArrayList<>();

    public Topico(DatosRegistroTopico datosRegistroTopico) {

        this.titulo= datosRegistroTopico.titulo();
        this.mensaje= datosRegistroTopico.mensaje();
        this.usuario= new Usuario(datosRegistroTopico.usuario());
        this.curso= new Curso(datosRegistroTopico.curso());
    }


    }
