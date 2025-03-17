package com.ec3.ec3_GiancarloClementeCcanto.Controller;


import com.ec3.ec3_GiancarloClementeCcanto.Model.Prestamo;
import com.ec3.ec3_GiancarloClementeCcanto.Service.PrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/prestamos")
public class PrestamoController {

    @Autowired
    private PrestamoService prestamoService;

    @GetMapping
    public ResponseEntity<List<Prestamo>> getAllPrestamos() {
        List<Prestamo> prestamos = prestamoService.getAllPrestamos();
        return ResponseEntity.ok(prestamos);
    }
}