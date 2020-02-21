package com.andriusk.didemo;

import com.andriusk.didemo.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        Arrays.asList(
                (MyController) ctx.getBean("primaryController"),
                ctx.getBean(PropertyInjectedController.class),
                ctx.getBean(SetterInjectedController.class),
                ctx.getBean(ConstructorInjectedController.class)

        ).forEach(ctr -> System.out.println(ctr.sayHello()));
    }
}
