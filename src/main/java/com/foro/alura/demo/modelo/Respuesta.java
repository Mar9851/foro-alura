/*package com.foro.alura.demo.modelo;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name="TBrespuestas")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@NoArgsConstructor
public class Respuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mensaje;
    private Topico topico;
    private LocalDateTime fechaCreacion = LocalDateTime.now();
    private Usuario autor;
    private Boolean solucion = false;
}*/
