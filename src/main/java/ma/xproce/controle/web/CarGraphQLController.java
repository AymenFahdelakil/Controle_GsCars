package ma.xproce.controle.web;

import lombok.AllArgsConstructor;
import ma.xproce.controle.dto.CarDTO;
import ma.xproce.controle.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class CarGraphQLController {

    @Autowired
    private CarService carService;
    @MutationMapping
    public CarDTO saveCar(@Argument CarDTO car){
        return carService.saveCar(car);
    }
    @QueryMapping
    public List<CarDTO> getCarByModel(@Argument String model){
        return carService.getCarByModel(model);
    }
}
