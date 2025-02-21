package org.inventario.kyqa.repository;

import org.inventario.kyqa.entities.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface InventarioRepository extends JpaRepository<Inventario, Integer> {
}