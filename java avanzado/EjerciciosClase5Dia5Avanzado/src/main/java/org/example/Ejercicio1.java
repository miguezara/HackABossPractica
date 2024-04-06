package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1 {

    public static void main(String[] args) {
        List<String> nombres = Arrays.asList(
                "Ana","Juan","Carlos","Antonio","Pedro",
                "Maria","Roque","Anabela","Peter","Nancy");

        List<String> lista1 = nombres.stream()
                .map(x -> x.toUpperCase())
                .filter(p -> p.startsWith("A"))
                .toList();
        lista1.forEach(System.out::println);
        System.out.println("---------------");
        lista1.stream()
                .filter(n -> n.length() > 5)
                .sorted()
                .toList()
                .forEach(System.out::println);
    }
}
