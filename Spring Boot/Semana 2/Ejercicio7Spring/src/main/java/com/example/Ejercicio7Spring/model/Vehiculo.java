package com.example.Ejercicio7Spring.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vehiculo {
    private Long id;
    private String marca;
    private String modelo;
    private double kilometros;
    private int puertas;
    private double precio;
}
