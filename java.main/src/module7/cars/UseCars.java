package module7.cars;

import java.util.Optional;

/**
 * Created by citsym on 05.06.17.
 */
public class UseCars {

    public static void main(String[] args) {

        Engine engine = new Engine();
//        engine.setName("BMW");
        Car car = new Car(engine);


        System.out.println("length: " + getCarNameLenght(car));
    }

//    private static int getCarNameLenght(Car car) {
//
//        if (car.getEngine() != null && car.getEngine().getName()!=null){
//            int length =  car.getEngine().getName().length();
//            return length;
//        }
//
//        return 0;
//    }


    private static int getCarNameLenght(Car car) {

//        Objects.requireNonNull(car.getEngine());

//        assert car.getEngine() != null : "ENGINE SHOULD NOT BE NULL";

        String name = Optional.of(car).map(Car::getEngine).map(Engine::getName).orElse("");

        return name.length();

    }
}
