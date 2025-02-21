package org.inventario.kyqa.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class GlobalExceptionHandler {
    // Clase interna para el formato del error
    @Data
    @AllArgsConstructor
    private static class ErrorResponse {
        private int status;
        private String message;
        private Instant timestamp;
    }
}
