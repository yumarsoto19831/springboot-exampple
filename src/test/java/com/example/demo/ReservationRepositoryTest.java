package com.example.demo;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by yumar on 7/2/2018.
 */
@DataJpaTest
@RunWith(SpringRunner.class)
public class ReservationRepositoryTest {

    @Autowired
    private ReservationRepository reservationRepository;
    @Test
    public void findByName(){
        /*Arrange*/
        reservationRepository.save(new Reservation(null, "Jane"));
        /*Action*/
        Reservation reservation = reservationRepository.findByName("Jane");
        /*Assert*/
        Assertions.assertThat(reservation.getName()).isEqualTo("Jane");
    }
}
