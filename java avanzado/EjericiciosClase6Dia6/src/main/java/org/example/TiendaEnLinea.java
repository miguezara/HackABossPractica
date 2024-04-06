package org.example;

import java.util.List;

public class TiendaEnLinea {

    public static void main(String[] args) {
        /*EJERCICIO 2*/
        // Crear inventario para electrónicos
        Inventario<Electronico> inventarioElectronico = new Inventario<>();
        inventarioElectronico.agregarProducto(new Electronico("Laptop", 1200.0, "MarcaX"));
        inventarioElectronico.agregarProducto(new Electronico("Smartphone", 800.0, "MarcaY"));
        inventarioElectronico.agregarProducto(new Electronico("Mouse", 5500.0, "MarcaX"));
        inventarioElectronico.agregarProducto(new Electronico("Monitor", 8300.0, "MarcaY"));

        //Mostrar inventarios
        inventarioElectronico.mostrarInventario();









        /*EJERCICIO 5*/
        //Filtrar por marca
        /*List<Electronico> listFiltrados = listElectronicos.stream()
                .filter(p -> p.getMarca().equalsIgnoreCase("marcax"))
                .toList();
        listFiltrados.forEach(p -> System.out.println(p.getPrecio()));

        //Obtener el precio maximo de los productos
        double maximo = listFiltrados.stream()
                .mapToDouble(p -> p.getPrecio())
                .max()
                .orElse(0.00);
        System.out.println("Maximo es: "+maximo);*/


    }
}
