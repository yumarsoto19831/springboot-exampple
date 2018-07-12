package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yumar on 7/2/2018.
 */
@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public  Car getCarDetails(String name) {
        Car car = carRepository.findByName(name);
        if (car == null){
            throw new CarNotFoundException();
        }
        return car;
    }
}
