package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by yumar on 7/3/2018.
 */
@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    Car findByName(String pirus);
}
