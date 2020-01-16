package com.andriusk.didemo;

import com.andriusk.didemo.controllers.ConstructorInjectedController;
import com.andriusk.didemo.controllers.PrimaryController;
import com.andriusk.didemo.controllers.PropertyInjectedController;
import com.andriusk.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        PrimaryController controller = (PrimaryController) ctx.getBean("primaryController");
        System.out.println(controller.sayHello());

        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }

}
