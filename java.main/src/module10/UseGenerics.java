package module10;

import module7.cars.Car;

import java.util.Arrays;

/**
 * Created by citsym on 12.06.17.
 */
public class UseGenerics {

    public static void main(String[] args) {

        Animal[] animals;
        animals = new Animal[0];

        animals = addElementToArray(animals, new Bird());
        animals = addElementToArray(animals, new Bird());
        animals = addElementToArray(animals, new Elephant());


        for (Animal animal : animals) {
            System.out.println(animal);
        }


        Robot[] robots = new Robot[0];

        robots = addElementToArray(robots, new Robot());
        robots = addElementToArray(robots, new Robot());
        robots = addElementToArray(robots, new Robot());
        robots = addElementToArray(robots, new Robot());


        for (Robot car : robots) {
            System.out.println(car);
        }

        ElementAdder<Animal> elementAdder = new ElementAdder<>();

        elementAdder.addElementToArray(animals, new Animal(), new Car());
//        elementAdder.addElementToArray(robots, new Robot());
//        elementAdder.addElementToArray(robots, new Robot());

    }

    private static <T extends CanBeFeeded> T[] addElementToArray(T[] animals, T element) {
        T[] newArray = Arrays.copyOf(animals, animals.length + 1);
        newArray[newArray.length-1] = element;

        element.feed();
        return newArray;
    }

}
