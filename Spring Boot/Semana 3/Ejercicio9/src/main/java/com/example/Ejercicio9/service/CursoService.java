package com.example.Ejercicio9.service;

import com.example.Ejercicio9.dto.CursoDTO;
import com.example.Ejercicio9.model.Curso;
import com.example.Ejercicio9.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class CursoService implements ICursoService{

@Autowired
CursoRepository cursoRepository;


    @Override
    public CursoDTO crearCurso(CursoDTO cursoDTO) {
        Curso curso = new Curso();
        curso.setNombre(cursoDTO.getNombre());
        curso.setTipoCurso(cursoDTO.getTipoCurso());
        curso.setFechaFinalizacion(cursoDTO.getFechaFinalizacion());
        curso.setTemas(new ArrayList<>()); // Inicializamos la lista de temas vacía
        curso = cursoRepository.save(curso);
        return mapToDTO(curso);
    }

    @Override
    public List<CursoDTO> obtenerTodosLosCursos() {
        List<Curso> cursos = cursoRepository.findAll();
        return cursos.stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    @Override
    public List<CursoDTO> buscarCursosPorNombre(String nombre) {
        List<Curso> cursos = cursoRepository.findByNombreContaining(nombre);
        return cursos.stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    @Override
    public CursoDTO obtenerCursoPorId(Long id) {
        Optional<Curso> optionalCurso = cursoRepository.findById(id);
        if (optionalCurso.isPresent()) {
            return mapToDTO(optionalCurso.get());
        }
        throw new NoSuchElementException("Curso no encontrado con ID: " + id);
    }

    @Override
    public CursoDTO actualizarCurso(Long id, CursoDTO cursoDTO) {
        Optional<Curso> optionalCurso = cursoRepository.findById(id);
        if (optionalCurso.isPresent()) {
            Curso curso = optionalCurso.get();
            curso.setNombre(cursoDTO.getNombre());
            curso.setTipoCurso(cursoDTO.getTipoCurso());
            curso.setFechaFinalizacion(cursoDTO.getFechaFinalizacion());
            curso = cursoRepository.save(curso);
            return mapToDTO(curso);
        }
        throw new NoSuchElementException("Curso no encontrado con ID: " + id);
    }

    @Override
    public void eliminarCurso(Long id) {
        if (cursoRepository.existsById(id)) {
            cursoRepository.deleteById(id);
        } else {
            throw new NoSuchElementException("Curso no encontrado con ID: " + id);
        }
    }

    private CursoDTO mapToDTO(Curso curso) {
        CursoDTO cursoDTO = new CursoDTO();
        cursoDTO.setId(curso.getId());
        cursoDTO.setNombre(curso.getNombre());
        cursoDTO.setTipoCurso(curso.getTipoCurso());
        cursoDTO.setFechaFinalizacion(curso.getFechaFinalizacion());
        // Mapear los temas si es necesario
        return cursoDTO;
    }
}
