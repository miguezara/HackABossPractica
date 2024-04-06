package org.example;

public class Ejercicio4 {

    public static void main(String[] args) {
        MiClase<String> c1= new MiClase<String>("Roque");
        c1.mostrarTipo();

        MiClase<Double> c2= new MiClase<Double>(25.00);
        c2.mostrarTipo();

        MiClase<Producto> c3= new MiClase<Producto>(new Producto("Producto1",500.00));
        c3.mostrarTipo();
    }
}
