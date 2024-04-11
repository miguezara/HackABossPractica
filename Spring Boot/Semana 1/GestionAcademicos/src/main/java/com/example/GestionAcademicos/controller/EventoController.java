package com.example.GestionAcademicos.controller;

import com.example.GestionAcademicos.model.Evento;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/eventos")
public class EventoController {

    private List<Evento> listaEventos = new ArrayList<>();

    @GetMapping
    public ResponseEntity<List<Evento>> obtenerEventosProximos() {
        // Simplemente retornamos la lista de eventos
        return ResponseEntity.ok(listaEventos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Evento> obtenerEventoPorId(@PathVariable Long id) {
        // Buscamos el evento por su ID
        for (Evento evento : listaEventos) {
            if (evento.getId().equals(id)) {
                return ResponseEntity.ok(evento);
            }
        }
        // Si no se encuentra, retornamos un ResponseEntity con estado 404 (Not Found)
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/evento")
    public ResponseEntity<Void> crearEvento(@RequestBody Evento evento) {
        // Generamos un ID para el evento (podría ser secuencial o aleatorio)
        Long id = (long) (listaEventos.size() + 1);
        evento.setId(id);
        // Agregamos el evento a la lista
        listaEventos.add(evento);
        // Retornamos un ResponseEntity con estado 201 (Created)
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
