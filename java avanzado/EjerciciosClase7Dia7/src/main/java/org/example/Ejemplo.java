package org.example;

import java.util.Arrays;

public class Ejemplo {

    public static void main(String[] args) {
        //Ejemplo de llamado a la funcion recursiva sumar()
        int[] listaNumeros= {2, 4};
        int resultado = sumar(listaNumeros);
        System.out.println("Resultado: "+resultado);
    }

    public static int sumar(int[] numeros) {
        //System.out.println(" - numeros.length: "+numeros.length);
        if (numeros.length == 0) {
            return 0;
        } else {
            //Arrays.stream(numeros).forEach(System.out::print);
            //return numeros[0] + sumar(Arrays.copyOfRange(numeros, 1, numeros.length));
            int[] nuevoVector = Arrays.copyOfRange(numeros, 1, numeros.length);
            System.out.println("nuevoVector.length: "+nuevoVector.length);
            return numeros[0] + sumar(nuevoVector);
        }
    }

}
