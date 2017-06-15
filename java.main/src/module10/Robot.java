package module10;

/**
 * Created by citsym on 12.06.17.
 */
public class Robot implements CanBeFunWith{

    @Override
    public void feed(){
        System.out.println("I`m an robot. And i`m eating the energy");
    }

    @Override
    public void tellAJoke() {
        System.out.println("Robot tels stupid joke");
    }

    @Override
    public void drink(int liters) {
        System.out.println("Robot drinks an oil : " + liters);
    }
}
