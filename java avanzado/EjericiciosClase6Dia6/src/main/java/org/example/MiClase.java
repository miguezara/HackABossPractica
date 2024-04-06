package org.example;

public class MiClase<T> {

    private T objeto;

    public MiClase(T objeto) {
        this.objeto = objeto;
    }

    public void mostrarTipo(){
        System.out.println("T es un: "+objeto.getClass().getSimpleName());
    }
}
