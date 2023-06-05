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
    private Long id;
    private String nombre;
    private String email;
    private String contrasena;

    public Usuario(DatosRegistroUsuario usuario) {
        this.nombre=usuario.nombre();
        this.email=usuario.email();
        this.contrasena=usuario.contrasena();

    }

    public Usuario(Usuario usuario) {
    }
}
