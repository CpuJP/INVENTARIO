package org.inventario.kyqa.services;

import lombok.extern.slf4j.Slf4j;
import org.inventario.kyqa.dtos.SubareaDto;
import org.inventario.kyqa.entities.Subarea;
import org.inventario.kyqa.exception.MessageNotFoundException;
import org.inventario.kyqa.repository.SubareaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service(value = "subareaService")
@Slf4j
public class SubareaServiceImpl implements SubareaService{

    private final SubareaRepository subareaRepository;
    private final ModelMapper modelMapper;

    public SubareaServiceImpl(SubareaRepository subareaRepository, ModelMapper modelMapper) {
        this.subareaRepository = subareaRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public ResponseEntity<List<SubareaDto>> findAll() {
        List<Subarea> subareas = subareaRepository.findAll();
        if (!subareas.isEmpty()) {
            List<SubareaDto> dtos = subareas.stream()
                    .map(subarea -> modelMapper.map(subarea, SubareaDto.class))
                    .collect(Collectors.toList());
            return new ResponseEntity<>(dtos, HttpStatus.OK);
        } else {
            log.warn("No Subareas found");
            throw new MessageNotFoundException("No subareas found");
        }
    }
}
