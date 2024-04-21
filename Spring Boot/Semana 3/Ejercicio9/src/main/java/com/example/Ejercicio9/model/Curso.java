package com.example.Ejercicio9.model;

import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String tipoCurso;
    private LocalDate fechaFinalizacion;

    @OneToMany(mappedBy = "curso", cascade = CascadeType.ALL)
    private List<Tema> temas;

}

