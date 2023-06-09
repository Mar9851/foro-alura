package com.foro.alura.demo.controller;

import com.foro.alura.demo.modelo.Usuario;
import com.foro.alura.demo.records.DatosRegistroUsuario;
import com.foro.alura.demo.repository.IUsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final IUsuarioRepository iusuarioRepository;

    @Autowired
    public UsuarioController(IUsuarioRepository iusuarioRepository){
        this.iusuarioRepository = iusuarioRepository;
    }

    @PostMapping
    //@Operation(summary = "Registrar un usuario")
    //@SecurityRequirement(name = "bearerAuth")
    public void registrarUsuario(@RequestBody @Valid DatosRegistroUsuario datosRegistroUsuario){
        //BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        //String passwordEncriptada = passwordEncoder.encode(datosRegistroUsuario.contrasena());
        //var usuario = usuarioRepository.save(new Usuario(datosRegistroUsuario.nombre(),
                //datosRegistroUsuario.email(),passwordEncriptada));

        iusuarioRepository.save(new Usuario(datosRegistroUsuario));
        System.out.println(datosRegistroUsuario);
    }

}
