package com.example.ApiDatosEstudiantes.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Estudiante {

    private  String NumMatricula;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;

}
