package com.foro.alura.demo.modelo;

import com.foro.alura.demo.records.DatosRegistroUsuario;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="TBusuarios")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "autor_id")
    private Long id;
    private String nombre;
    private String email;
    private String contrasena;

    public Usuario(DatosRegistroUsuario autor) {
        this.nombre=autor.nombre();
        this.email=autor.email();
        this.contrasena=autor.contrasena();

    }


    public Usuario(Usuario autor) {
    }
}
