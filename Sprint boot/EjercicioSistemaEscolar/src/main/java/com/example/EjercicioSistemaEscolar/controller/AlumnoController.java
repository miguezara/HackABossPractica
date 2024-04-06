package com.example.EjercicioSistemaEscolar.controller;

import com.example.EjercicioSistemaEscolar.model.Alumno;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {
     List<Alumno> listaAlumnos = new ArrayList<>();

    @PostMapping
    public void agregarAlumno(@RequestBody Alumno alumno) {
        // Simplemente agregamos el alumno a la lista en memoria
        listaAlumnos.add(alumno);
    }

    @GetMapping
    public List<Alumno> obtenerTodosAlumnos() {
        // Devolvemos la lista completa de alumnos
        return listaAlumnos;
    }

    @GetMapping("/{id}")
    public Alumno obtenerAlumnoPorId(@PathVariable int id) {
        // Buscamos el alumno por su id
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getId() == id) {
                return alumno;
            }
        }
        // Si no se encuentra, se puede manejar de alguna forma (por ejemplo, lanzando una excepción)
        return null;
    }

    @GetMapping("/nivel/{nivel}")
    public List<Alumno> obtenerAlumnosPorNivel(@PathVariable String nivel) {
        // Creamos una lista para almacenar los alumnos del nivel especificado
        List<Alumno> alumnosNivel = new ArrayList<>();
        // Recorremos la lista de alumnos y agregamos los que coincidan con el nivel
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getNivelEducativo().equalsIgnoreCase(nivel)) {
                alumnosNivel.add(alumno);
            }
        }
        return alumnosNivel;
    }
}
