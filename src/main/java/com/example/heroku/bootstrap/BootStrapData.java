package com.example.heroku.bootstrap;

import com.example.heroku.repositories.PassengerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final PassengerRepository passengerRepository;

    public BootStrapData(PassengerRepository passengerRepository) {
        this.passengerRepository = passengerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
