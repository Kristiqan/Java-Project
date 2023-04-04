package com.api.main.config;


import com.api.main.model.Car;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.api.main.repository.CarRepository;

import java.util.List;

@Configuration
public class CarConfig {
    @Bean
    CommandLineRunner commandLineRunner (CarRepository carRepository){
        return args -> {
            Car car1 = new Car(
                    "Toyota",
                    "AE86 Trueno"

            );

            Car car2 = new Car(
                    "BMW",
                    "E46 M3 GTR"

            );


            carRepository.saveAll(List.of(car1,car2));
        };

    }

}
