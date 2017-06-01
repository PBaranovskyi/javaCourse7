package module10;

/**
 * Created by citsym on 29.05.17.
 */
public class Bird extends Animal {

    @Override
    void feed(){
        System.out.println("I`m a bird and I`m eating seeds");
    }

    void fly(){
        System.out.println("I`m a bird and I can fly");
    }

}
