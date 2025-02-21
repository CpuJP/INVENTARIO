package org.inventario.kyqa.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

@Data
public class ItemDto implements Serializable {

    private Long id;
    private String nombre;
    private Integer cantidad;
    private String descripcion;
    private String observaciones;
    private Instant fechaCreacion;
    private InventarioDto inventario;
    private EstadoDto estado;
    private List<SubareaDto> subareas;
    private List<FotoItemDto> fotos;
}
