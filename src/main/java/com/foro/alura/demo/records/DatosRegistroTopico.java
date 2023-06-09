package com.foro.alura.demo.records;

import com.foro.alura.demo.modelo.Curso;
import com.foro.alura.demo.modelo.Usuario;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotNull @Valid
        Usuario usuario,
        @NotNull @Valid
        Curso curso) {

}
