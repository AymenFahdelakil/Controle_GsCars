package ma.xproce.controle.mapper;

import ma.xproce.controle.dao.entities.Car;
import ma.xproce.controle.dto.CarDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {
    private final ModelMapper mapper = new ModelMapper();

    public Car fromCarDtoToCar(CarDTO carDTO) {
        return mapper.map(carDTO, Car.class);
    }
    public CarDTO fromCarToCarDto (Car car) {
        return mapper.map(car, CarDTO.class);
    }
}
