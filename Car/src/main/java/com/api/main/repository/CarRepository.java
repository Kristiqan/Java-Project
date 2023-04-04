package com.api.main.repository;


import com.api.main.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarRepository
         extends JpaRepository<Car, Long> {


    Optional<Car> findByMake(String make);

    Optional<Car> findByModel(String model);

    Optional<Car> findById(Long id);


}
