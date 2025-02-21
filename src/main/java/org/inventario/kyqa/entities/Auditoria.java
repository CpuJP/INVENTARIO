package org.inventario.kyqa.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenerationTime;

import java.time.Instant;

@Entity
@Table(name = "auditoria")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Auditoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Setter(AccessLevel.NONE)
    private Integer id;

    @NotBlank
    @Size(max = 255)
    @Column(name = "tabla", length = 255, nullable = false)
    private String tabla;

    @NotBlank
    @Size(max = 50)
    @Column(name = "operacion", length = 50, nullable = false)
    private String tipoOperacion;

    @Column(name = "datos_anteriores", columnDefinition = "JSON", nullable = true)
    private String datosAnteriores;

    @Column(name = "datos_nuevos", columnDefinition = "JSON", nullable = true)
    private String datosNuevos;

    @Column(name = "usuario", columnDefinition = "TEXT")
    private String usuario;


    @CreationTimestamp
    @Column(name = "fecha", updatable = false)
    @Setter(AccessLevel.NONE)
    private Instant fecha;
}
