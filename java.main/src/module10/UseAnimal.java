package module10;

/**
 * Created by citsym on 29.05.17.
 */
public class UseAnimal {

    public static void main(String[] args) {

        Animal animal = new Animal();

        feedAnAnimal(animal);

        System.out.println("==============");

        Bird bird = new Bird();

        feedAnAnimal(bird);
        bird.fly();





    }

    public static void feedAnAnimal(Animal animal) {
        System.out.println("Just now I will feed " + animal.getClass().getSimpleName());
        animal.feed();
    }
}
