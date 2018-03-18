package guru.springframework.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by Joachim on 18/03/2018.
 */

@Controller
public class MyController {

    public String hello(){
        System.out.println("hello");
        return "foo";
    }
}
