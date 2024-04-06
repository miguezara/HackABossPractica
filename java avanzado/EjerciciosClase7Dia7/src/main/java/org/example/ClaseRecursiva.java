package org.example;

public class ClaseRecursiva<T> {

    //Metodo RECURSIVO
    public void mostrarContenidoArray(T[] array, int indice){
        if (indice != array.length){
            System.out.println(array[indice]);
            //Llamdo recursivo
            mostrarContenidoArray(array, indice+1);
        }
    }
}
