package com.example.ApiDatosEstudiantes.controller;

import com.example.ApiDatosEstudiantes.model.Calificacion;
import com.example.ApiDatosEstudiantes.model.Estudiante;
import com.example.ApiDatosEstudiantes.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
    @Autowired
    private EstudianteService estudianteService;
    @PostMapping
    public ResponseEntity<String> agregarEstudiante(@RequestBody Estudiante estudiante) {
        estudianteService.agregarEstudiante(estudiante);
        return new ResponseEntity<>("Estudiante agregado correctamente", HttpStatus.CREATED);
    }

    @GetMapping
    List<Estudiante> obtenerTodosEstudiantes() {
        return estudianteService.obtenerTodosEstudiantes();
    }
    @GetMapping("/calificacion/{numMatricula}")
    public Calificacion obtenerCalificacionesPorMatricula(@PathVariable String numMatricula) {
        return estudianteService.obtenerCalificacionesPorMatricula(numMatricula);
    }

    @GetMapping("/calificacion/ordendesc")
    public List<Calificacion> obtenerCalaficacionesOrdenadasPorPromedio(){
        return estudianteService.obtenerCalificacionesOrdenadasPorPromedio();
    }
}
