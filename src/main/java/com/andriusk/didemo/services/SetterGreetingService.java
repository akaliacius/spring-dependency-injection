package com.andriusk.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

    public static final String GREETING = "Hello - I was injected via Setter method";

    @Override
    public String sayGreeting() {
        return GREETING;
    }
}
