package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by Joachim on 18/03/2018.
 * When you have constructor based dependency Injector then the Autowired is not necessary because
 * Spring does the Autowiring automatically
 */

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    //@Autowiring
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService){
        this.greetingService = greetingService;
    }


    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
