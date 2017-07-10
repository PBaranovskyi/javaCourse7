package module14;

/**
 * Created by citsym on 04.07.17.
 */
public class UseCountry {

    public static void main(String[] args) {
        Country france = new Country();

        Parlament parlament = france.getParlament();

        implementLaw(parlament);

    }

    private static void implementLaw(Parlament parlament) {
        String law = parlament.createLaw();
        //TODO implement law
    }
}
