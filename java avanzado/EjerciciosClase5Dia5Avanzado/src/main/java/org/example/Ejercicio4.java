package org.example;

import java.util.List;

public class Ejercicio4 {

    public static void main(String[] args) {
        List<Persona> personas = List.of(
                new Persona("Juan",19),
                new Persona("Jose",22),
                new Persona("Laura",14),
                new Persona("Ramón",29),
                new Persona("Jorge",13),
                new Persona("Maria",23)
        );

        List<Persona> personasFiltradas = personas.stream()
                .filter(x -> x.getEdad() > 18)
                .map(p -> new Persona(p.getNombre().toUpperCase(),p.getEdad()))
                .toList();
        personasFiltradas.forEach(System.out::println);

        System.out.println("........................");
        //Ordenar por nombre de la persona (tomando el compareTo de Persona)
        personasFiltradas.stream()
                .sorted()
                .toList()
                .forEach(System.out::println);
        System.out.println("------------------------");
        //Ordenar por edad de la persona (definiendo el compare)
        personasFiltradas.stream()
                .sorted((o1, o2) -> Integer.compare(o1.getEdad(), o2.getEdad()))
                .toList()
                .forEach(System.out::println);

    }
}
