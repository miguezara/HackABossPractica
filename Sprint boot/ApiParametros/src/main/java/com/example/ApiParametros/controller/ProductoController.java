package com.example.ApiParametros.controller;

import com.example.ApiParametros.modelo.Producto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class ProductoController {

     List<Producto> productos = Arrays.asList(

             new Producto(1, "producto1"),
             new Producto(2, "producto2"),
             new Producto(3, "producto3")
     );


    @GetMapping("/producto/{id}")
    public String ObtenerProducto(@PathVariable int id) {
        return productos.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .map(Producto::getNombre)
                .orElse("Producto no encontrado");

        /*Optional<Producto> producto = productos.stream()
                .filter(p -> p.getId() == id)
                .findFirst();
        return producto.map(Producto::getNombre).orElse("Producto no encontrado");*/
    }




}
