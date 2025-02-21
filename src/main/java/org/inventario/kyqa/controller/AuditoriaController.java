package org.inventario.kyqa.controller;

import org.inventario.kyqa.dtos.AuditoriaDto;
import org.inventario.kyqa.services.AuditoriaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/auditoria")
public class AuditoriaController {

    private final AuditoriaService auditoriaService;

    public AuditoriaController(AuditoriaService auditoriaService) {
        this.auditoriaService = auditoriaService;
    }

    @GetMapping
    public ResponseEntity<List<AuditoriaDto>> findAll() {
        return auditoriaService.findAll();
    }

    @GetMapping("/tipo/{tipoOperacion}")
    public ResponseEntity<List<AuditoriaDto>> findByTipoOperacion(@PathVariable String tipoOperacion) {
        return auditoriaService.findByTipoOperacion(tipoOperacion);
    }

    @GetMapping("/fecha")
    public ResponseEntity<List<AuditoriaDto>> findByFechaBetween(@RequestParam Instant fechaInicial, @RequestParam Instant fechaFinal) {
        return auditoriaService.findByFechaBetween(fechaInicial, fechaFinal);
    }

    @GetMapping("/tabla/{tabla}")
    public ResponseEntity<List<AuditoriaDto>> findByTabla(@PathVariable String tabla) {
        return auditoriaService.findByTabla(tabla);
    }
}
