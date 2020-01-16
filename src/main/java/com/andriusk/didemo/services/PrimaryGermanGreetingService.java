package com.andriusk.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService {

    public static final String GREETING = "Hallo vom Hauptgrußdienst";

    @Override
    public String sayGreeting() {
        return GREETING;
    }
}
