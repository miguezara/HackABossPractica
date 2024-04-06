package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*List<String> nombres = Arrays.asList("Ana","Juan","Carlos","Elena","Pedro","Maria");
        nombres.forEach(System.out::println);

        //Procesar mediante Stream
        List<String> listaFiltrada = nombres.stream()
                .filter(n -> n.length() > 4)// Filtrar nombres con más de 4 caracteres
                .map(n -> n.toUpperCase())// Convertir a mayúsculas
                .collect(Collectors.toList());// Recolectar en una lista
        System.out.println("-------------------");

        // Imprimir los nombres resultantes
        listaFiltrada.forEach(System.out::println);*/

        List<Persona> personas = List.of(
                new Persona("Juan",19),
                new Persona("Jose",22),
                new Persona("Laura",14),
                new Persona("Ramón",29),
                new Persona("Jorge",13),
                new Persona("Maria",33)
        );

        String nombrePrimeraPersonaMayorDe25 = personas.stream()
                .filter(p -> p.getEdad() > 25)
                .findFirst()
                .map(p -> p.getNombre())
                .orElse("No se encontró ninguna persona");
        System.out.println(nombrePrimeraPersonaMayorDe25);

    }
}