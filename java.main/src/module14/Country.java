package module14;

/**
 * Created by citsym on 04.07.17.
 */
public class Country {

    Parlament parlament = Parlament.INSTANCE;

    public Parlament getParlament() {
        return parlament;
    }

    public void setParlament(Parlament parlament) {
        this.parlament = parlament;
    }
}
