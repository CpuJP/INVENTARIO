package org.inventario.kyqa.controller;

import org.inventario.kyqa.dtos.SubareaDto;
import org.inventario.kyqa.services.SubareaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/subarea")
public class SubareaController {

    private final SubareaService subareaService;

    public SubareaController(SubareaService subareaService) {
        this.subareaService = subareaService;
    }

    @GetMapping
    public ResponseEntity<List<SubareaDto>> findAll() {
        return subareaService.findAll();
    }
}
