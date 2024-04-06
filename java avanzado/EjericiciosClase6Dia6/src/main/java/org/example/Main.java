package org.example;

import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        /*Caja<String> caja1 = new Caja<>();
        caja1.ponerContenido("Una cadena de caracteres");
        System.out.println("Contenido de caja1 es: "+caja1.obtenerContenido());
        System.out.println("El tipo de contenido de caja1 es: "+caja1.obtenerTipoContenido());

        Caja<Double> caja2 = new Caja<>();
        caja2.ponerContenido(25.50);
        System.out.println("Contenido de caja2 es: "+caja2.obtenerContenido());
        System.out.println("El tipo de contenido de caja2 es: "+caja2.obtenerTipoContenido());*/


        /*StringJoiner sj = new StringJoiner("; ", "(", ")");
        sj.add("Manzana").add("Banana").add("Cereza").add("Naranja");
        String resultado = sj.toString();
        System.out.println(resultado);*/


        /*StringTokenizer tokenizer = new StringTokenizer("Java es un lenguaje de programación", " ");
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println("El token obtenido es: "+token);
            // Hacer algo con cada token
        }*/

        Pattern patron = Pattern.compile("[0-9]+");
        Matcher matcher = patron.matcher("12345");
        boolean esNumero = matcher.matches();  // Devuelve true
        System.out.println(esNumero);

    }
}