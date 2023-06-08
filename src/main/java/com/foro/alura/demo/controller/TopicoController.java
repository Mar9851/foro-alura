package com.foro.alura.demo.controller;

import com.foro.alura.demo.modelo.Topico;
import com.foro.alura.demo.records.DatosRegistroTopico;
import com.foro.alura.demo.repository.ITopicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Clock;

@RestController
@RequestMapping("/topico")
public class TopicoController {
    @Autowired
    private ITopicoRepository iTopicoRepository;
    @PostMapping
    public void postTopico(@RequestBody @Valid DatosRegistroTopico datosRegistroTopico){

        iTopicoRepository.save(new Topico(datosRegistroTopico));
    }
}
