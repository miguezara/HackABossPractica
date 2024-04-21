package com.example.Ejercicio9.repository;

import com.example.Ejercicio9.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
   List<Curso> findByNombreContaining(String nombre);
}
