package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Collections;

/**
 * Created by yumar on 7/2/2018.
 */
@RestController
@RequestMapping("/")
public class ReservationRestController {

    private final ReservationRepository reservationRepository;

    public ReservationRestController(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @GetMapping("/reservations")
    public Collection<Reservation> reservations(){
        return this.reservationRepository.findAll();
    }
}
