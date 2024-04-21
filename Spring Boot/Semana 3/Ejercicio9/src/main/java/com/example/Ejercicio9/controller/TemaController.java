package com.example.Ejercicio9.controller;
import com.example.Ejercicio9.dto.TemaDTO;
import com.example.Ejercicio9.service.TemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/temas")
public class TemaController {

    @Autowired
    TemaService temaService;
    @PostMapping
    public ResponseEntity<TemaDTO> crearTema(@RequestBody TemaDTO temaDTO) {
        TemaDTO nuevoTema = temaService.crearTema(temaDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoTema);
    }

    @GetMapping("/curso/{cursoId}")
    public ResponseEntity<List<TemaDTO>> obtenerTemasDeCurso(@PathVariable Long cursoId) {
        List<TemaDTO> temas = temaService.obtenerTemasDeCurso(cursoId);
        return ResponseEntity.ok(temas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TemaDTO> obtenerTemaPorId(@PathVariable Long id) {
        TemaDTO tema = temaService.obtenerTemaPorId(id);
        return ResponseEntity.ok(tema);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TemaDTO> actualizarTema(@PathVariable Long id, @RequestBody TemaDTO temaDTO) {
        TemaDTO temaActualizado = temaService.actualizarTema(id, temaDTO);
        return ResponseEntity.ok(temaActualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarTema(@PathVariable Long id) {
        temaService.eliminarTema(id);
        return ResponseEntity.noContent().build();
    }
}
