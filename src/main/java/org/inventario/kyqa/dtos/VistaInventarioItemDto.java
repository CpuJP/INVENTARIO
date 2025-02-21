package org.inventario.kyqa.dtos;

import lombok.Data;

import java.io.Serializable;

@Data
public class VistaInventarioItemDto implements Serializable {

    private Integer numeroItem;

    private String inventarioNombre;

    private String estadoItem;

    private String itemNombre;

    private String subAreas;

    private Integer cantidad;

    private String descripcion;

    private String observaciones;

    private String foto;
}
