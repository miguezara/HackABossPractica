package com.example.EjercicioClase3.controller;

import com.example.EjercicioClase3.model.Producto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoController {

    @PostMapping("/productos")
    public String crearProducto(@RequestBody Producto nuevoProducto) {

        return "Producto creado: " + nuevoProducto.getNombre()+  " precio es de : "+ nuevoProducto.getPrecio();
    }
}

