package org.example;

import java.util.List;
import java.util.Optional;

public class Ejercicio5 {

    public static void main(String[] args) {
        List<Cliente> clientes = List.of(
                new Cliente("Juan"),
                new Cliente("Jose"),
                new Cliente("Laura"),
                new Cliente("Ramón"),
                new Cliente("Jorge"),
                new Cliente("Maria"),
                new Cliente("Fernando")
        );

        String busqueda = "laura";
        Optional<Cliente> optionalCliente = clientes.stream()
                .filter(c -> c.getApellido().equalsIgnoreCase(busqueda))
                .findFirst();
        //1- Obtener directamente con .get() (Problema: Puede lanzar una exepción)
        //System.out.println(optionalCliente.get());

        //2- Usar isPresent()
        if (optionalCliente.isPresent()){
            System.out.println("Un cliente encontrado");
        }else{
            System.out.println("No se encontró ningún cliente");
        }

        //3- Devolver un cliente
        Cliente clienteBuscado = clientes.stream()
                .filter(c -> c.getApellido().equalsIgnoreCase(busqueda))
                .findFirst()
                .orElse(new Cliente(busqueda));
        System.out.println(clienteBuscado);

        //4- Devolver un String
        clientes.stream()
                .filter(c -> c.getApellido().equalsIgnoreCase(busqueda))
                .findFirst()
                .ifPresentOrElse(value -> System.out.println(value.getApellido()),
                                        () -> System.out.printf("Cliente no encontrado"));

    }
}
