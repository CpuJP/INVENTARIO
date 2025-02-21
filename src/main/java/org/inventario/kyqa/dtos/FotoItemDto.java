package org.inventario.kyqa.dtos;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
public class FotoItemDto implements Serializable {
    private Long id;
    private String nombreArchivo;
    private String ruta;
}
