package microservicios.demo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Microservices")
@Getter
@Setter

@NoArgsConstructor

public class MicroEntity {
    @Id
    private String id;
    private String name;
    private String description;
    private int total;
    private int available;

}

