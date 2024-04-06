package org.example;

import java.util.*;

public class Ejercicio3 {

    public static void main(String[] args) {
        // Lista de comentarios de usuarios
        List<String> comentarios = Arrays.asList(
                "Este producto es genial. ¡Lo recomiendo! muy especialmente",
                "No estoy satisfecho con el servicio al cliente.",
                "Increíble oferta. ¡Compré dos!",
                "El envío fue rápido y el producto llegó en perfecto estado.",
                "No recomendaría este producto a nadie."
        );

        // Contar palabras más frecuentes
        /*Map<String, Integer> frecuenciaPalabras = contarPalabras(comentarios);
        System.out.println("Palabras más frecuentes:");
        frecuenciaPalabras.forEach((palabra, frecuencia) -> System.out.println(palabra + ":Frecuencia:"+frecuencia));*/


        // Censurar ciertas palabras
        List<String> palabrasCensuradas = Arrays.asList("genial", "recomendaría", "rápido", "perfecto", "especialmente");
        List<String> comentariosCensurados = censurarPalabras(comentarios, palabrasCensuradas);
        System.out.println("\nComentarios censurados:");
        comentariosCensurados.forEach(System.out::println);

    }

    // Utilizando la clase java.util.StringTokenizer para contar palabras
    private static Map<String, Integer> contarPalabras(List<String> comentarios) {
        Map<String, Integer> frecuenciaPalabras = new HashMap<>();

        //Recorre la lista de comentarios
        for (String comentario : comentarios) {
         //   System.out.println("*********Linea: "+comentario);
            //Se toma el tokenizer establecimiento los DELIMITADORES
            StringTokenizer tokenizer = new StringTokenizer(comentario.toLowerCase(), " .,!?¡");
            //Recorre las palabras de cada comentario
            while (tokenizer.hasMoreTokens()) {
                String palabra = tokenizer.nextToken();
            //    System.out.println("Palabra: "+palabra);
                //Agrega al map para guardar la palabra y la cantidad de veces que aparece
                frecuenciaPalabras.put(palabra, frecuenciaPalabras.getOrDefault(palabra, 0) + 1);
            }
        }

        // Ordenar por frecuencia descendente
        return sortByValueDescending(frecuenciaPalabras);
    }

    // Utilizando la clase java.util.Collections para ordenar un Map por valores de forma descendente
    private static <K, V extends Comparable<? super V>> Map<K, V> sortByValueDescending(Map<K,V> map){
        List<Map.Entry<K, V>> listaEntradas = new ArrayList<>(map.entrySet());
       // listaEntradas.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));
        listaEntradas.sort(Map.Entry.comparingByValue());
        //Vuelve a colocar en un MAP, pero ordenado
        Map<K, V> mapaOrdenado = new LinkedHashMap<>();
        for (Map.Entry<K, V> entrada : listaEntradas) {
            mapaOrdenado.put(entrada.getKey(), entrada.getValue());
        }
        return mapaOrdenado;
    }


    // Utilizando la clase java.util.StringJoiner para censurar palabras
    private static List<String> censurarPalabras(List<String> comentarios, List<String> palabrasCensuradas) {
        List<String> comentariosCensurados = new ArrayList<>();
        for (String comentario : comentarios) {
            StringJoiner joiner = new StringJoiner(" ");
            StringTokenizer tokenizer = new StringTokenizer(comentario, " .,!?¡");
            while (tokenizer.hasMoreTokens()) {
                String palabra = tokenizer.nextToken();
                if (palabrasCensuradas.contains(palabra.toLowerCase())) {
                    // Censurar la palabra
                    joiner.add("*censurado*");
                } else {
                    joiner.add(palabra);
                }
            }
            comentariosCensurados.add(joiner.toString());
        }
        return comentariosCensurados;
    }


}
