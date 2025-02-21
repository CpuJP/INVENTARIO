package org.inventario.kyqa.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Table(name = "fotos_items")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FotoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Setter(AccessLevel.NONE)
    private Integer id;

    // Relación muchos a uno con Item
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id", nullable = true)
    private Item item;

    @NotBlank
    @Column(name = "nombre_archivo", nullable = false)
    private String nombreArchivo;

    @NotBlank
    @Column(name = "ruta", nullable = false, columnDefinition = "TEXT")
    private String ruta;
}
