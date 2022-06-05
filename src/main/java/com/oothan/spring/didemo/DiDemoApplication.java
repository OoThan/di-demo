package com.oothan.spring.didemo;

import com.oothan.spring.didemo.controllers.ConstructorInjectedController;
import com.oothan.spring.didemo.controllers.MyController;
import com.oothan.spring.didemo.controllers.PropertyInjectedController;
import com.oothan.spring.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.oothan.spring.services", "com.oothan.spring.didemo"})
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        MyController controller = (MyController) ctx.getBean("myController");
        controller.hello();

        System.out.println(controller.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }

}
