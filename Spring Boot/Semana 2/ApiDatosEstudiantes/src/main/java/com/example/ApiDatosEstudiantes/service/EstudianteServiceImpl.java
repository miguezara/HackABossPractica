package com.example.ApiDatosEstudiantes.service;
import com.example.ApiDatosEstudiantes.model.Calificacion;
import com.example.ApiDatosEstudiantes.model.Estudiante;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EstudianteServiceImpl implements EstudianteService {

    List<Estudiante> estudiantes = new ArrayList<>();
    List<Calificacion> calificaciones = new ArrayList<>();

    @Override
    public List<Estudiante> obtenerTodosEstudiantes() {
        return estudiantes;


    }

    @Override
    public Calificacion obtenerCalificacionesPorMatricula(String numMatricula) {
        //Buscar calificaciones por numero matricula
        for (Calificacion calificacion : calificaciones) {
            if (calificacion.getEstudiante().getNombre().equals(numMatricula)) {
                return calificacion;

            }

        }


        return null;
    }

    @Override
    public List<Calificacion> obtenerCalificacionesOrdenadasPorPromedio() {
        // Calcular el promedio de cada calificación y ordenarlas por promedio en orden descendente
        calificaciones.sort((c1, c2) -> {
            double promedio1 = (c1.getCalificacion1() + c1.getCalificacion2() + c1.getCalificacion3()) / 3.0;
            double promedio2 = (c2.getCalificacion1() + c2.getCalificacion2() + c2.getCalificacion3()) / 3.0;
            return Double.compare(promedio2, promedio1);
        });
        return calificaciones;
    }

    @Override
    public Estudiante agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
        return estudiante;
    }
}


