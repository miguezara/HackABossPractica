package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Ejercicio2 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(7,80,23,4,45,11,74,6,30,90);

        BinaryOperator<Integer> binaryOperator = (acum, nro) -> acum+nro;
        //Forma 1: Con reduce
        Integer suma1 = numeros.stream()
                .filter(n -> n > 10)
                .reduce(0, binaryOperator);
                //.reduce(0, (acum, nro) -> acum+nro);
        System.out.println("Suma es: "+suma1);

        //Forma 2: Con mapToInt y sum
        Integer suma2 = numeros.stream()
                .filter(n -> n > 10)
                .mapToInt(nro -> nro)
                .sum();
        System.out.println("Suma es: "+suma2);
    }
}
