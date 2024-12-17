package ma.xproce.controle.service;

import lombok.AllArgsConstructor;
import ma.xproce.controle.dao.entities.Car;
import ma.xproce.controle.dao.repositories.CarRepository;
import ma.xproce.controle.dto.CarDTO;
import ma.xproce.controle.mapper.CarMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CarManager implements CarService {

    private CarRepository carRepository;
    private CarMapper carMapper;

    @Override
    public CarDTO saveCar(CarDTO carDTO) {
        Car car = carMapper.fromCarDtoToCar(carDTO);
        car = carRepository.save(car);
        carDTO = carMapper.fromCarToCarDto(car);
        return carDTO;
    }

    @Override
    public List<CarDTO> getCarByModel(String model) {
        List<Car> cars = carRepository.findByModel(model);
        List<CarDTO> carDTOS = new ArrayList<>();
        for (Car car : cars) {
            carDTOS.add(carMapper.fromCarToCarDto(car));
        }
        return carDTOS;
    }
}
