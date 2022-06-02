package com.oothan.spring.didemo.controllers;

import com.oothan.spring.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingServiceImpl greetingService;


    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
