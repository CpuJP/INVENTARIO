package org.inventario.kyqa.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "subareas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Subarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Setter(AccessLevel.NONE)
    private Integer id;

    @NotBlank
    @Size(max = 100)
    @Column(name = "nombre", length = 100, nullable = false, unique = true)
    private String nombre;

    @ManyToMany(mappedBy = "subareas")
    private List<Item> items;
}
