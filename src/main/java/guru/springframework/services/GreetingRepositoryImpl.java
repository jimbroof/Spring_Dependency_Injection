package guru.springframework.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by Joachim on 19/03/2018.
 */
@Service
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servicio de Saludo Primario";
    }

    @Override
    public String getGermanGreeting() {

        return "Primärer Grußdienst";
    }
}
