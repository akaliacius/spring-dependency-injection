package com.andriusk.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService {

    public static final String GREETING = "Hello - I have been injected via property";

    @Override
    public String sayGreeting() {
        return GREETING;
    }
}
