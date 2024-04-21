package com.example.Ejercicio9.service;

import com.example.Ejercicio9.dto.TemaDTO;

import java.util.List;

public interface ITemaService {
    TemaDTO crearTema(TemaDTO temaDTO);
    List<TemaDTO> obtenerTemasDeCurso(Long cursoId);
    TemaDTO obtenerTemaPorId(Long id);
    TemaDTO actualizarTema(Long id, TemaDTO temaDTO);
    void eliminarTema(Long id);
}
