package com.example.Ejercicio9.repository;

import com.example.Ejercicio9.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TemaRepository extends JpaRepository<Tema, Long> {
    List<Tema> findByCursoId(Long cursoId);
}
