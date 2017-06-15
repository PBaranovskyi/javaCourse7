package module10;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by citsym on 29.05.17.
 */
public class UseAnimal {

    public static void main(String[] args) {

        Animal animal = new Animal();

//        feedAnCreature(animal);

        System.out.println("==============");

        Bird bird = new Bird();

//        feedAnCreature(bird);
        bird.fly();

        Robot robot = new Robot();

//        feedAnCreature(robot);

        Fear fear = new Fear();

//        feedAnCreature(fear);


        List<CanBeFeeded> list = new ArrayList<>();
        list.add(animal);
        list.add(fear);
        list.add(robot);
        list.add(bird);
//        list.add("String");

        feedAnCreatures(list);

        List<CanBeFunWith> listOfFun = new ArrayList<>();
        listOfFun.add(robot);

        letsFun(listOfFun);

        feedAnCreatures(listOfFun);

    }

    private static void letsFun(List<CanBeFunWith> list) {
        for (CanBeFunWith canBeFunWith : list) {
            canBeFunWith.drink(10);
            canBeFunWith.tellAJoke();
            canBeFunWith.feed();
        }
    }

    public static void feedAnCreature(CanBeFeeded creature) {
        System.out.println("Just now I will feed " + creature.getClass().getSimpleName());
        creature.feed();
    }

    public static void feedAnCreatures(List<? extends CanBeFeeded> creatures) {
        for (CanBeFeeded creature : creatures) {
            System.out.println("Just now I will feed " + creature.getClass().getSimpleName());
            creature.feed();
        }

        for (CanBeFeeded creature : creatures) {

        }


    }

}
