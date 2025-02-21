package org.inventario.kyqa.repository;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.inventario.kyqa.entities.Auditoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.Date;
import java.util.List;

@Repository
@EnableJpaRepositories
public interface AuditoriaRepository extends JpaRepository<Auditoria, Integer> {

    @Transactional(readOnly = true)
    List<Auditoria> findByTipoOperacionLike(@NotBlank @Size(max = 50) String tipoOperacion);

    @Transactional(readOnly = true)
    List<Auditoria> findAuditoriasByFechaBetween(Instant fechaAfter, Instant fechaBefore);

    @Transactional(readOnly = true)
    List<Auditoria> findAuditoriasByTablaLike(@NotBlank @Size(max = 255) String tabla);
}