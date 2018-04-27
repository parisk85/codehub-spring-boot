package com.codehub.spring.core.controllers;

import com.codehub.spring.core.services.GreetingService;

public class AutowiredInjectedController {

    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
        System.out.println("Using setter too..");
    }

//    public AutowiredInjectedController(GreetingService greetingService) {
//        this.greetingService = greetingService;
//        System.out.println("..Or using constructor");
//    }
}