package com.foro.alura.demo.repository;

import com.foro.alura.demo.modelo.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICursoRepository extends JpaRepository<Curso, Long> {
}
