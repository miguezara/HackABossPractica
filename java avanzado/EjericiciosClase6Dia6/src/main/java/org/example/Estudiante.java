package org.example;

import java.util.List;

public class Estudiante {
    //Atributos
    private String nombre;
    private List<Double> calificaciones;
    private int edad;

    public Estudiante() {
    }

    public Estudiante(String nombre, List<Double> calificaciones, int edad) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
        this.edad = edad;
    }

    public List<Double> getCalificaciones() {
        return calificaciones;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", calificaciones=" + calificaciones +
                ", edad=" + edad +
                '}';
    }
}
