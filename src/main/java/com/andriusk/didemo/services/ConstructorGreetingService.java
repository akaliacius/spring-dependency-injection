package com.andriusk.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    public static final String GREETING = "Hello - I was injected via constructor";

    @Override
    public String sayGreeting() {
        return GREETING;
    }
}
