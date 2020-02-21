package com.andriusk.didemo.controllers;

import com.andriusk.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryController implements MyController{

    private final GreetingService greetingService;

    public PrimaryController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Override
    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
