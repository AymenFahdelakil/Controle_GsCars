package ma.xproce.controle;

import ma.xproce.controle.dto.CarDTO;
import ma.xproce.controle.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ControleApplication implements CommandLineRunner {

    @Autowired
    private CarService carService;

    public static void main(String[] args) {
        SpringApplication.run(ControleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        carService.saveCar(new CarDTO( "Toyota Corolla", "White", "ABC-123", 20000.0));
        carService.saveCar(new CarDTO( "Honda Civic", "Black", "XYZ-456", 22000.0));
        carService.saveCar(new CarDTO( "Ford Mustang", "Red", "DEF-789", 35000.0));
        carService.saveCar(new CarDTO( "BMW X5", "Blue", "GHI-012", 50000.0));


    }
}
