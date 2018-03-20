package guru.springframework.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Joachim on 18/03/2018.
 */
@Service
@Primary
@Profile({"en","default"})
public class PrimaryGreetingService implements GreetingService {

    private GreetingService greetingService;

    @Autowired
    public PrimaryGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Override
    public String sayGreeting() {
        return "Hello from the primary Greeting Service!!!";
    }
}
