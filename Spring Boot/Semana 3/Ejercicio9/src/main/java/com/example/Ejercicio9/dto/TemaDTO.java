package com.example.Ejercicio9.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TemaDTO {
    private Long id;
    private String nombre;
    private String descripcion;
    private Long cursoId;
}
