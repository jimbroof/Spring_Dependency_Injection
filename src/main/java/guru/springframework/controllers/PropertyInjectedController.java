package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImpl;

/**
 * Created by Joachim on 18/03/2018.
 */
public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
