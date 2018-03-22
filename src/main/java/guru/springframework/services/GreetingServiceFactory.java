package guru.springframework.services;

/**
 * Created by Joachim on 22/03/2018.
 */
public class GreetingServiceFactory {

    public GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang){

        switch (lang){
            case "en":
                return new PrimaryGreetingService(greetingRepository);
            case "de":
                return new PrimaryGermanGreetingService(greetingRepository);
            case "es":
                return new PrimarySpanishGreetingService(greetingRepository);
            default:
                return  new PrimaryGreetingService(greetingRepository);

        }
    }
}
