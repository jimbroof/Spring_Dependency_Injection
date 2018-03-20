package guru.springframework.services;

import org.springframework.stereotype.Service;

/**
 * Created by Joachim on 18/03/2018.
 */
@Service
public class GetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting(){
        return "Hello, I was injected by the getter";
    }


}
