package com.foro.alura.demo.records;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;

public record DatosRegistroCurso(
        @NotBlank
        String nombre,
        @NotBlank
        String categoria) {

}
