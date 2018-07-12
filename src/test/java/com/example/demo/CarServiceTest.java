package com.example.demo;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.anyString;

/**
 * Created by yumar on 7/3/2018.
 */
@RunWith(MockitoJUnitRunner.class)
public class CarServiceTest {

    @Mock
    private CarRepository carRepository;

    private CarService carService;

    @Before
    public void setUp() throws Exception{
        carService = new CarService(carRepository);
    }


    @Test
    public void getCarDetails_returnsCarInfo() throws Exception {
        /*Arrange*/
        given(carRepository.findByName("pirus")).willReturn(new Car(null,"pirus","hybrid"));
        /*Act*/
        Car car = carService.getCarDetails("pirus");
        /*Assert*/
        assertThat(car.getName()).isEqualTo("pirus");
        assertThat(car.getType()).isEqualTo("hybrid");
    }

    @Test(expected = CarNotFoundException.class)
    public void getCarDetails_whenCarNotFound() throws Exception {
        /*Arrange*/
        given(carRepository.findByName("pirus")).willReturn(null);
        /*Act*/
        Car car = carService.getCarDetails("pirus");
    }


}