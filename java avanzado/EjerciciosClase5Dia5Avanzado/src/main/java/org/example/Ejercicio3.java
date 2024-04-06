package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Ejercicio3 {

    public static void main(String[] args) {
        List<Integer> notas = Arrays.asList(4,8,9,7,10,7,10,8,6,10);

        //Opción 1
        int suma = notas.stream()
                .mapToInt(p -> p)
                .sum();
        double promedio1 = (double) suma / notas.stream().count();
        System.out.println("El promedio es: "+promedio1);

        //Opción 2
        double promedio2 = (double) notas.stream()
                .mapToInt(n->n)
                .sum() / notas.size();
        System.out.println("El promedio es: "+promedio2);


        //Opción 3 (arroja un exepción - NoSuchElementException: No value present)
        OptionalDouble promedio3 = notas.stream()
                .mapToInt(n->n)
                .average();
        System.out.println("El promedio es: "+promedio3.getAsDouble());

        //Opción 4
        double promedio4 = notas.stream()
                .mapToInt(n->n)
                .average()
                .orElse(0.00);
        System.out.println("El promedio es: "+promedio4);

        //Opción 5
        notas.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .ifPresentOrElse(value -> System.out.println("El promedio es: " + value), () -> System.out.println("El listado está vacio"));
    }
}
