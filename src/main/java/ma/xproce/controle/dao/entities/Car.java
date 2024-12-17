package ma.xproce.controle.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jdk.jfr.Enabled;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Setter
@Getter

public class Car {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id_Car;
    private String model;
    private String color;
    private String matricul;
    private Float price;
}
