package com.andriusk.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("es")
public class PrimarySpanishGreetingService implements GreetingService{

    public static final String GREETING = "Hola desde el servicio de saludo principal";

    @Override
    public String sayGreeting() {
        return GREETING;
    }
}
