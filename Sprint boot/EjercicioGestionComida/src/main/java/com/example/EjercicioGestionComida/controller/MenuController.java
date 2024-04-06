package com.example.EjercicioGestionComida.controller;

import com.example.EjercicioGestionComida.model.Plato;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {
    private List<Plato> menu = new ArrayList<>();

    @PostMapping("/agregar")
    public ResponseEntity<Void> agregarPlatoAlMenu(@RequestBody Plato plato) {
        menu.add(plato);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<List<Plato>> obtenerMenu() {
        return ResponseEntity.ok(menu);
    }
}
