package org.example;

import java.util.Comparator;

public class Persona implements Comparable {
    private String nombre;
    private Integer edad;

    public Persona() {
    }

    public Persona(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Persona p = (Persona) o;
        return nombre.compareTo(p.nombre);
    }
}
