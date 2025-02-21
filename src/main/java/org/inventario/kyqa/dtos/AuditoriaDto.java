package org.inventario.kyqa.dtos;

import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

@Data
public class AuditoriaDto implements Serializable {

    private Integer id;

    private String tabla;

    private String tipoOperacion;

    private String datosAnteriores;

    private String datosNuevos;

    private String usuario;

    private Instant fecha;
}
