package com.example.heroku.repositories;

import com.example.heroku.domain.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository <Passenger, Long>{

}
