package module5.webinar;

/**
 * Created by citsym on 22.05.17.
 */
public class PersonTO {
    private final String fio;
    private final String street;
    private final String sex;


    public PersonTO(String fio, String street, String sex) {

        this.fio = fio;
        this.street = street;
        this.sex = sex;
    }

    public String getFio() {
        return fio;
    }

    public String getStreet() {
        return street;
    }

    public String getSex() {
        return sex;
    }


    @Override
    public String toString() {
        return "PersonTO{" +
                "fio='" + fio + '\'' +
                ", street='" + street + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
