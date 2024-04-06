package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ejercicio1 {

    public static void main(String[] args) {
        //Creo una lista de estudiantes
        List<Estudiante> estudiantes = Arrays.asList(
                new Estudiante("Carlos",Arrays.asList(8.0,7.0,9.0),20),
                new Estudiante("Ana", Arrays.asList(9.0, 8.0, 9.0), 17),
                new Estudiante("Juan", Arrays.asList(7.0, 8.0, 6.0), 19),
                new Estudiante("Elena", Arrays.asList(8.0, 9.0, 8.0), 21),
                new Estudiante("Pedro", Arrays.asList(7.0, 8.0, 8.0), 18),
                new Estudiante("Maria", Arrays.asList(9.0, 9.0, 9.0), 20)
        );

        //Filtrar los estudiantes mayores a 18 años
        System.out.println("Estudiantes mayores a 18 años");
        estudiantes.stream()
                .filter(e -> e.getEdad() > 18)
                .forEach(System.out::println);

        //Calcular y mostrar el promedio de calificaciones de CADA estudiante
        System.out.println("Promedio de cada estudiante");
        estudiantes.forEach(e -> {
                    double promedio = e.getCalificaciones().stream()
                            .mapToDouble(c -> c.doubleValue())
                            .average()
                            .orElse(0.00);
                    System.out.println("Estudiante: "+e.getNombre()+" - Promedio: "+promedio);
                });

    }
}
