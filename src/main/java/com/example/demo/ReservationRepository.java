package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by yumar on 7/2/2018.
 */
@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long>{


    Reservation findByName(String jane);
}
