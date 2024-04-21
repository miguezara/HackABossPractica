package com.example.Ejercicio9.service;

import com.example.Ejercicio9.dto.TemaDTO;
import com.example.Ejercicio9.model.Curso;
import com.example.Ejercicio9.model.Tema;
import com.example.Ejercicio9.repository.CursoRepository;
import com.example.Ejercicio9.repository.TemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class TemaService implements ITemaService{

    @Autowired
    TemaRepository temaRepository;
    @Autowired
    CursoRepository cursoRepository;
    @Override
    public TemaDTO crearTema(TemaDTO temaDTO) {
        Tema tema = new Tema();
        tema.setNombre(temaDTO.getNombre());
        tema.setDescripcion(temaDTO.getDescripcion());
        Optional<Curso> optionalCurso = cursoRepository.findById(temaDTO.getCursoId());
        if (optionalCurso.isPresent()) {
            tema.setCurso(optionalCurso.get());
            tema = temaRepository.save(tema);
            return mapToDTO(tema);
        }
        throw new NoSuchElementException("Curso no encontrado con ID: " + temaDTO.getCursoId());
    }

    @Override
    public List<TemaDTO> obtenerTemasDeCurso(Long cursoId) {
        List<Tema> temas = temaRepository.findByCursoId(cursoId);
        return temas.stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    @Override
    public TemaDTO obtenerTemaPorId(Long id) {
        Optional<Tema> optionalTema = temaRepository.findById(id);
        if (optionalTema.isPresent()) {
            return mapToDTO(optionalTema.get());
        }
        throw new NoSuchElementException("Tema no encontrado con ID: " + id);
    }

    @Override
    public TemaDTO actualizarTema(Long id, TemaDTO temaDTO) {
        Optional<Tema> optionalTema = temaRepository.findById(id);
        if (optionalTema.isPresent()) {
            Tema tema = optionalTema.get();
            tema.setNombre(temaDTO.getNombre());
            tema.setDescripcion(temaDTO.getDescripcion());
            // No permitimos cambiar el curso al que pertenece el tema
            tema = temaRepository.save(tema);
            return mapToDTO(tema);
        }
        throw new NoSuchElementException("Tema no encontrado con ID: " + id);
    }

    @Override
    public void eliminarTema(Long id) {
        if (temaRepository.existsById(id)) {
            temaRepository.deleteById(id);
        } else {
            throw new NoSuchElementException("Tema no encontrado con ID: " + id);
        }
    }

    private TemaDTO mapToDTO(Tema tema) {
        TemaDTO temaDTO = new TemaDTO();
        temaDTO.setId(tema.getId());
        temaDTO.setNombre(tema.getNombre());
        temaDTO.setDescripcion(tema.getDescripcion());
        // No incluimos el ID del curso en el DTO del tema
        return temaDTO;
    }
}


