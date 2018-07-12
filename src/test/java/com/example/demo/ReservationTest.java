package com.example.demo;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by yumar on 7/2/2018.
 */
public class ReservationTest {
    @Test
    public void creation(){
        /*Arrange*/
        Reservation r = new Reservation(1L, "Jane");
        Reservation r1 = new Reservation();
        /*Action*/
        r1.setId(2L);
        r1.setName("Jon");
        /*Assert*/
        Assert.assertEquals((Long) 1L, r.getId());
        Assertions.assertThat(r.getName()).isEqualTo("Jane");
    }
}
