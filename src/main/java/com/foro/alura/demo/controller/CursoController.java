package com.foro.alura.demo.controller;

import com.foro.alura.demo.modelo.Curso;
import com.foro.alura.demo.records.DatosRegistroCurso;
import com.foro.alura.demo.repository.ICursoRepository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    private final ICursoRepository icursoRepository;

    public CursoController(ICursoRepository icursoRepository) {

        this.icursoRepository = icursoRepository;
    }

    @GetMapping
    public List<Curso> getAllCursos() {

        return icursoRepository.findAll();
    }

    @PostMapping
    public void postCurso(@RequestBody @Valid DatosRegistroCurso datosRegistroCurso) {

        icursoRepository.save(new Curso(datosRegistroCurso));
    }
    }
