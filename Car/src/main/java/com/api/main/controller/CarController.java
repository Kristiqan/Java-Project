package com.api.main.controller;


import com.api.main.service.CarService;
import com.api.main.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping(path = "api/v1")
public class CarController {
    private CarService carService;

    @Autowired
    public CarController(CarService carService){
        this.carService = carService;
    }
    @GetMapping(path = "/cars")
    public List<Car> getCars(){return carService.getCars();}
}
