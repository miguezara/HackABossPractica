package org.example;

public class Caja <T>{
    private T contenido;

    public void ponerContenido(T contenido){
        this.contenido = contenido;
    }
    public T obtenerContenido(){
        return contenido;
    }


    public String obtenerTipoContenido(){
        return contenido.getClass().getSimpleName();
    }
}
