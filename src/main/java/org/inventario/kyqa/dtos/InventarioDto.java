package org.inventario.kyqa.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

@Data
public class InventarioDto implements Serializable {

    private Integer id;

    private String nombre;

    private String descripcion;

    private Instant fechaCreacion;
}
