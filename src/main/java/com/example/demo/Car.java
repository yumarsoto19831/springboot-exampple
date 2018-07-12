package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by yumar on 7/2/2018.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Car {


    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String type;
}
