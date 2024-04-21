package com.example.Ejercicio9.controller;
import com.example.Ejercicio9.dto.CursoDTO;
import com.example.Ejercicio9.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    CursoService cursoService;

    @PostMapping
    public ResponseEntity<CursoDTO> crearCurso(@RequestBody CursoDTO cursoDTO) {
        CursoDTO nuevoCurso = cursoService.crearCurso(cursoDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoCurso);
    }

    @GetMapping
    public ResponseEntity<List<CursoDTO>> obtenerTodosLosCursos() {
        List<CursoDTO> cursos = cursoService.obtenerTodosLosCursos();
        return ResponseEntity.ok(cursos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CursoDTO> obtenerCursoPorId(@PathVariable Long id) {
        CursoDTO curso = cursoService.obtenerCursoPorId(id);
        return ResponseEntity.ok(curso);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CursoDTO> actualizarCurso(@PathVariable Long id, @RequestBody CursoDTO cursoDTO) {
        CursoDTO cursoActualizado = cursoService.actualizarCurso(id, cursoDTO);
        return ResponseEntity.ok(cursoActualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarCurso(@PathVariable Long id) {
        cursoService.eliminarCurso(id);
        return ResponseEntity.noContent().build();
    }
}

