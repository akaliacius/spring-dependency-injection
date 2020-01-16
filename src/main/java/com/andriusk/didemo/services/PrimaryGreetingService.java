package com.andriusk.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"en", "default"})
@Primary
public class PrimaryGreetingService implements GreetingService {

    public static final String GREETING = "Hello from the primary greeting service";

    @Override
    public String sayGreeting() {
        return GREETING;
    }
}
