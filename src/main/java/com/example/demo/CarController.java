package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by yumar on 7/2/2018.
 */
@RestController
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/car/{name}")
    public Car getCar(@PathVariable String name){
        return carService.getCarDetails(name);
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.NOT_FOUND)
    private void carNotFoundHandler(CarNotFoundException e){}
}
