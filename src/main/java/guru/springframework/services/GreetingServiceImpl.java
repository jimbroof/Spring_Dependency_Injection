package guru.springframework.services;

import org.springframework.stereotype.Service;

/**
 * Created by Joachim on 18/03/2018.
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "HELLO GURUS!!! - Original" ;

    @Override
    public String sayGreeting(){
        return HELLO_GURUS;
    }
}
