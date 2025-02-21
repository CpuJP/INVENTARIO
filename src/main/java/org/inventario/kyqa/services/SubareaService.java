package org.inventario.kyqa.services;

import org.inventario.kyqa.dtos.SubareaDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface SubareaService {
    ResponseEntity<List<SubareaDto>> findAll();
}
