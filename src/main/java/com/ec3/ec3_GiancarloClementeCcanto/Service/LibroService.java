package com.ec3.ec3_GiancarloClementeCcanto.Service;

import com.ec3.ec3_GiancarloClementeCcanto.Model.Libro;
import com.ec3.ec3_GiancarloClementeCcanto.Repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    public Libro saveLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    public List<Libro> getAllLibros() {
        return libroRepository.findAll();
    }

    public Optional<Libro> getLibroById(Long id) {
        return libroRepository.findById(id);
    }
}