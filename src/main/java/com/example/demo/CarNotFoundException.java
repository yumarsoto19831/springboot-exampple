package com.example.demo;

import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by yumar on 7/3/2018.
 */
@ResponseStatus
public class CarNotFoundException extends RuntimeException {

}
