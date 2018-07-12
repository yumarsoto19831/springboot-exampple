package com.example.demo;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by yumar on 7/2/2018.
 */
@DataJpaTest
@RunWith(SpringRunner.class)
public class ReservationJPATest {

    @Autowired
    TestEntityManager testEntityManager;

    @Test
    public void mapping(){
        /*Arrange*/
        Reservation jane =this.testEntityManager.persistFlushFind(new Reservation(null,"Jane"));
        /*Assert*/
        assertThat(jane.getName()).isEqualTo("Jane");

    }

}
