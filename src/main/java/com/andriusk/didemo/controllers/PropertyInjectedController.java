package com.andriusk.didemo.controllers;

import com.andriusk.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController implements MyController {

    @Autowired
    @Qualifier("propertyGreetingService")
    public GreetingService greetingServiceImpl;

    @Override
    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }
}
