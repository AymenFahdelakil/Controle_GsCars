package ma.xproce.controle.service;

import ma.xproce.controle.dto.CarDTO;

import java.util.List;


public interface CarService {
    public CarDTO saveCar(CarDTO carDTO);
    public List<CarDTO> getCarByModel(String model);
}
