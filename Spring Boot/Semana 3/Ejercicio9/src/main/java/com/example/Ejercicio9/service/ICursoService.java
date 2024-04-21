package com.example.Ejercicio9.service;

import com.example.Ejercicio9.dto.CursoDTO;

import java.util.List;

public interface ICursoService {
    CursoDTO crearCurso(CursoDTO cursoDTO);
    List<CursoDTO> obtenerTodosLosCursos();
    List<CursoDTO> buscarCursosPorNombre(String nombre);
    CursoDTO obtenerCursoPorId(Long id);
    CursoDTO actualizarCurso(Long id, CursoDTO cursoDTO);
    void eliminarCurso(Long id);
}
