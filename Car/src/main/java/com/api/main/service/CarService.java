package com.api.main.service;

import com.api.main.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.main.repository.CarRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {
    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository){
        this.carRepository = carRepository;
    }

    public List<Car> getCars(){return carRepository.findAll();}

    public Optional<Car> getCarById(Long id){
        return carRepository.findById(id);
    }

    public Optional<Car> getCarByMake(String make){
        return carRepository.findByMake(make);
    }

    public Optional<Car> getCarById(String model){
       return carRepository.findByModel(model);
    }

    public void addNewCar(Car car){
       Optional<Car> optionalCar = carRepository.findById(car.getId());
       if(optionalCar.isPresent()){
           throw new IllegalStateException("\"This id:\" + \"[\" + car.getId()+\"] is taken\"");
       }
       carRepository.save(car);
    }

}
