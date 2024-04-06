package org.example;

public class Recursividad {

    //Ejercicio 1
    public void imprimir(int numero){
        //System.out.println("LLama con: "+numero);
        if (numero <= 5){
            System.out.println(numero);
            //Se llama a si mismo (Recursividad)
            imprimir(numero+1);
        }
    }

    public int sumar (int numero){
        //Forma 1
        /*if (numero > 1){
            return numero + sumar(numero - 1);
        }else{
            return 1;
        }
        return 1;*/
        //Forma 2
        /*if (numero > 0) {
            int sumaNumero = sumar(numero-1);
            return sumaNumero + numero;
        }
        return 0;*/

        //Forma 3
        if (numero == 1){
            return 1;
        }else{
            return numero + sumar(numero-1);
        }

    }

    public int factorial(int numero){
        //Forma 3
        if (numero == 1){
            return 1;
        }else{
            return numero * factorial(numero-1);
        }
    }




}
