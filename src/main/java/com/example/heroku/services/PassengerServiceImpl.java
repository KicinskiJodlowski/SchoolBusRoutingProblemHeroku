package com.example.heroku.services;

import com.example.heroku.domain.Passenger;
import com.example.heroku.repositories.PassengerRepository;

import java.util.List;

public class PassengerServiceImpl implements PassengerService {

    private final PassengerRepository passengerRepository;

    public PassengerServiceImpl(PassengerRepository passengerRepository) {
        this.passengerRepository = passengerRepository;
    }

    @Override
    public Passenger findPassengerById(Long id) {
        return passengerRepository.findById(id).get();
    }

    @Override
    public List<Passenger> findAllPassengers() {
        return passengerRepository.findAll();
    }
}
