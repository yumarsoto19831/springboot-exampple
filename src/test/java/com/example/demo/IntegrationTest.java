package com.example.demo;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.*;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

/**
 * Created by yumar on 7/2/2018.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
public class IntegrationTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void testName() throws Exception{
        /*Arrange*/

        /*Action*/
        ResponseEntity<Car> response = testRestTemplate.getForEntity("/car/pirus", Car.class);
        /*Assert*/
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody().getName()).isEqualTo("pirus");
        assertThat(response.getBody().getType()).isEqualTo("hybrid");
    }

}
