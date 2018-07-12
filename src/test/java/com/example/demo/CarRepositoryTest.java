package com.example.demo;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

/**
 * Created by yumar on 7/3/2018.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class CarRepositoryTest {
    @Autowired
    private CarRepository repository;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void getCar_returnsCarDetails() throws Exception {

        /*Arrange*/
        Car savedCar = entityManager.persistFlushFind(new Car(null,"pirus","hybrid"));
        /*Act*/
        Car car = repository.findByName("pirus");
        /*Assert*/
        assertThat(car.getName()).isEqualTo(savedCar.getName());
    }

}