package com.example.ApiDatosEstudiantes.service;

import com.example.ApiDatosEstudiantes.model.Calificacion;
import com.example.ApiDatosEstudiantes.model.Estudiante;

import java.util.List;

public interface EstudianteService {
    List<Estudiante> obtenerTodosEstudiantes();
    Calificacion obtenerCalificacionesPorMatricula(String numMatricula);
    List<Calificacion> obtenerCalificacionesOrdenadasPorPromedio();

    Estudiante agregarEstudiante(Estudiante estudiante);
}

