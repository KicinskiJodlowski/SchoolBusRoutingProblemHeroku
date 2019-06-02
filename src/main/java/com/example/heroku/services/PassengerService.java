package com.example.heroku.services;

import com.example.heroku.domain.Passenger;

import java.util.List;

public interface PassengerService {

    Passenger findPassengerById(Long id);

    List<Passenger> findAllPassengers();
}
