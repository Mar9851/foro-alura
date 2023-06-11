package com.foro.alura.demo.records;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotNull
        DatosRegistroUsuario usuario,
        @NotNull
        DatosRegistroCurso curso) {

}
