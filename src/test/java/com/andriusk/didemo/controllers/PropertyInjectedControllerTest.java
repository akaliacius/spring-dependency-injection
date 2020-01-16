package com.andriusk.didemo.controllers;

import com.andriusk.didemo.services.PropertyGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PropertyInjectedControllerTest {

    private PropertyInjectedController controller;

    @BeforeEach
    public void setup(){
        this.controller = new PropertyInjectedController();
        this.controller.greetingServiceImpl = new PropertyGreetingService();
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(PropertyGreetingService.GREETING, controller.sayHello());
    }
}
