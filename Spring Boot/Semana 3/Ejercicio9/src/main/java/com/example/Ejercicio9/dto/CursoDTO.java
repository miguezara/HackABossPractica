package com.example.Ejercicio9.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CursoDTO {
    private Long id;
    private String nombre;
    private String tipoCurso;
    private LocalDate fechaFinalizacion;
    private List<TemaDTO> temas;
}
