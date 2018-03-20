package guru.springframework.services;

/**
 * Created by Joachim on 19/03/2018.
 */
public interface GreetingRepository {

    String getEnglishGreeting();

    String getSpanishGreeting();

    String getGermanGreeting();
}
