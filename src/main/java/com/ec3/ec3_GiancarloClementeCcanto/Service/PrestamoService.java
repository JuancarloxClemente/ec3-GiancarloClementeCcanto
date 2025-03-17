package com.ec3.ec3_GiancarloClementeCcanto.Service;

import com.ec3.ec3_GiancarloClementeCcanto.Model.Prestamo;
import com.ec3.ec3_GiancarloClementeCcanto.Repository.PrestamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrestamoService {

    @Autowired
    private PrestamoRepository prestamoRepository;
    public List<Prestamo> getPrestamos() {
        return prestamoRepository.findAll();
    }
}
