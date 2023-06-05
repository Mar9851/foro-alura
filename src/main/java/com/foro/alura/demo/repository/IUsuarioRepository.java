package com.foro.alura.demo.repository;

import com.foro.alura.demo.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {
}
