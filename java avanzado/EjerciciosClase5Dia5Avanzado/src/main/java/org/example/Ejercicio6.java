package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio6 {

    public static void main(String[] args) {
        List<Producto> productos = Arrays.asList(
                new Producto("Laptop", 1200.0, "Electrónicos"),
                new Producto("Smartphone", 800.0, "Electrónicos"),
                new Producto("Libro", 20.0, "Libros"),
                new Producto("Mochila", 50.0, "Moda"),
                new Producto("Cámara", 300.0, "Electrónicos")
        );

        //1- Filtra los productos de una categoría específica.
        List<Producto> productoFiltrados = productos.stream()
                .filter(p -> p.getCategoria().equalsIgnoreCase("Electrónicos"))
                .toList();
        productoFiltrados.forEach(p -> System.out.println("Producto: "+p.getNombre()));

        //2- Ordena los productos por precio de forma descendente.
        List<Producto> productoOrdenados = productos.stream()
                //.sorted((p1, p2) -> Double.compare(p2.getPrecio(),p1.getPrecio()))
                //.sorted(Comparator.comparingDouble(Producto::getPrecio).reversed())
                .sorted(Comparator.comparingDouble(Producto::getPrecio).reversed())
                //.sorted((p1, p2) -> String.CASE_INSENSITIVE_ORDER.compare(p2.getNombre(),p1.getNombre()))
                .collect(Collectors.toList());
        productoOrdenados.forEach(p -> System.out.println("Producto: "+p.getNombre()+" Precio: "+p.getPrecio()));


        //3- Calcular el promedio de los precios de los productos.
        double promedio = productos.stream()
                //.map(p -> p.getNombre())
                .mapToDouble(p -> p.getPrecio())
                .average()
                .orElse(0.00);
        System.out.println("El promedio es: "+promedio);
    }
}
