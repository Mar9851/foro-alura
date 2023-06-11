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

    public Usuario(DatosRegistroUsuario datosRegistroUsuario) {
        this.nombre=datosRegistroUsuario.nombre();
        this.email=datosRegistroUsuario.email();
        this.contrasena=datosRegistroUsuario.contrasena();

    }


    public Usuario(Usuario usuario) {
    }
}
