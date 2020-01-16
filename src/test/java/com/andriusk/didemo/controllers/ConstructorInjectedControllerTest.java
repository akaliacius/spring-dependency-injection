package com.andriusk.didemo.controllers;

import com.andriusk.didemo.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController controller;

    @BeforeEach
    public void setup(){
        this.controller = new ConstructorInjectedController(new ConstructorGreetingService());
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(ConstructorGreetingService.GREETING, controller.sayHello());
    }
}
