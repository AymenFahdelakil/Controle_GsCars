package ma.xproce.controle.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

public class CarDTO {

    String model;
    String color;
    String matricul;
    double price;


}
