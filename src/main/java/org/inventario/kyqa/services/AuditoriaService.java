package org.inventario.kyqa.services;

import org.inventario.kyqa.dtos.AuditoriaDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.Instant;
import java.util.Date;
import java.util.List;

public interface AuditoriaService {

    ResponseEntity<List<AuditoriaDto>> findAll();

    ResponseEntity<List<AuditoriaDto>> findByTipoOperacion(@PathVariable String tipoOperacion);

    ResponseEntity<List<AuditoriaDto>> findByFechaBetween(@RequestParam Instant fechaInicial, @RequestParam Instant fechaFinal);

    ResponseEntity<List<AuditoriaDto>> findByTabla(@PathVariable String tabla);
}
