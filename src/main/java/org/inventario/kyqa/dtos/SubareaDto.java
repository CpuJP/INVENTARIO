package org.inventario.kyqa.dtos;

import lombok.Data;

import java.io.Serializable;

@Data
public class SubareaDto implements Serializable {

    private Integer id;

    private String nombre;
}
