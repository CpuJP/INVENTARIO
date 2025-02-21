package org.inventario.kyqa.dtos;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
public class EstadoDto implements Serializable {

    private Long id;
    private String nombre;
}
