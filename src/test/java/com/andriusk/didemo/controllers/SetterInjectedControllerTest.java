package com.andriusk.didemo.controllers;

import com.andriusk.didemo.services.SetterGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetterInjectedControllerTest {

    private SetterInjectedController controller;

    @BeforeEach
    public void setup(){
        this.controller = new SetterInjectedController();
        this.controller.setGreetingService(new SetterGreetingService());
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(SetterGreetingService.GREETING, controller.sayHello());
    }
}
