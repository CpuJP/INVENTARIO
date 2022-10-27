package microservicios.demo.repository;

import microservicios.demo.entity.MicroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MicroRepositorio extends JpaRepository<MicroEntity, String> {

}
