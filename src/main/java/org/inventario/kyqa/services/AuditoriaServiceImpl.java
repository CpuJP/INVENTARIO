package org.inventario.kyqa.services;

import lombok.extern.slf4j.Slf4j;
import org.inventario.kyqa.dtos.AuditoriaDto;
import org.inventario.kyqa.entities.Auditoria;
import org.inventario.kyqa.exception.MessageBadRequestException;
import org.inventario.kyqa.exception.MessageNotFoundException;
import org.inventario.kyqa.repository.AuditoriaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@Service(value = "auditoriaService")
@Slf4j
public class AuditoriaServiceImpl implements AuditoriaService {

    private final AuditoriaRepository auditoriaRepository;
    private final ModelMapper modelMapper;

    public AuditoriaServiceImpl(AuditoriaRepository auditoriaRepository, ModelMapper modelMapper) {
        this.auditoriaRepository = auditoriaRepository;
        this.modelMapper = modelMapper;
    }

    public List<AuditoriaDto> toDto(List<Auditoria> auditorias) {
        List<AuditoriaDto> dtos = auditorias.stream()
                .map(auditoria -> modelMapper.map(auditoria, AuditoriaDto.class))
                .toList();
        return dtos;
    }

    @Override
    public ResponseEntity<List<AuditoriaDto>> findAll() {
        List<Auditoria> auditorias = auditoriaRepository.findAll();
        if (!auditorias.isEmpty()) {
            return new ResponseEntity<>(toDto(auditorias), HttpStatus.OK);
        } else {
            log.warn("No Auditoria found");
            throw new MessageNotFoundException("No Auditoria found");
        }
    }

    @Override
    public ResponseEntity<List<AuditoriaDto>> findByTipoOperacion(String tipoOperacion) {
        List<Auditoria> auditorias = auditoriaRepository.findByTipoOperacionLike(tipoOperacion);
        if (!auditorias.isEmpty()) {
            return new ResponseEntity<>(toDto(auditorias), HttpStatus.OK);
        } else {
            log.warn(String.format("No Auditoria found by type of operation %s", tipoOperacion));
            throw new MessageBadRequestException(String.format("No Auditoria found by type of operation %s", tipoOperacion));
        }
    }

    @Override
    public ResponseEntity<List<AuditoriaDto>> findByFechaBetween(Instant fechaInicial, Instant fechaFinal) {
        List<Auditoria> auditorias = auditoriaRepository.findAuditoriasByFechaBetween(fechaInicial, fechaFinal);
        if (!auditorias.isEmpty()) {
            return new ResponseEntity<>(toDto(auditorias), HttpStatus.OK);
        } else {
            // Formatea las fechas para el mensaje
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
                    .withZone(ZoneId.systemDefault());
            String fechaInicialStr = dateFormatter.format(fechaInicial);
            String fechaFinalStr = dateFormatter.format(fechaFinal);

            log.warn(String.format("no audit found between date range %s and %s", fechaInicialStr, fechaFinalStr));
            throw new MessageNotFoundException(String.format("no audit found between date range %s and %s", fechaInicialStr, fechaFinalStr));
        }
    }

    @Override
    public ResponseEntity<List<AuditoriaDto>> findByTabla(String tabla) {
        List<Auditoria> auditorias = auditoriaRepository.findAuditoriasByTablaLike(tabla);
        if (!auditorias.isEmpty()) {
            return new ResponseEntity<>(toDto(auditorias), HttpStatus.OK);
        } else {
            log.warn(String.format("No Auditoria found by table %s", tabla));
            throw new MessageBadRequestException(String.format("No Auditoria found by table %s", tabla));
        }
    }
}
