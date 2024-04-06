package org.example;

public class Electronico extends Producto{
    private String marca;

    public Electronico(String nombre, double precio, String marca) {
        super(nombre, precio);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }
}
