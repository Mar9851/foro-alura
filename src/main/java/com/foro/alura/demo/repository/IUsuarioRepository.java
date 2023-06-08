package com.foro.alura.demo.repository;

import com.foro.alura.demo.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {
}
