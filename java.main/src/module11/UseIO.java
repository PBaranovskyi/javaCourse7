package module11;

import module7.cars.Car;

import java.io.*;

/**
 * Created by citsym on 15.06.17.
 */
public class UseIO {

    public static void main(String[] args) throws IOException, ClassNotFoundException {


        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("objects"));
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("objects"))
        ) {

            Car car = new Car();
        car.setColor("Red");
        car.setYear(2000);
        car.setName("Nissan");
//
//        Car car2 = new Car();
//        car2.setColor("Blue");
//        car2.setYear(1900);
//        car2.setName("Some");
//
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("objects"));
        objectOutputStream.writeObject(car);
//        objectOutputStream.writeObject(car2);


            Car car1 = (Car) objectInputStream.readObject();
            System.out.println(car1);
            System.out.println(car1.getExpirationDate());
//        System.out.println(car1.getColor());
//        System.out.println(car1.getName());
//        System.out.println(car1.getYear());

//            Car car22 = (Car) objectInputStream.readObject();
//            System.out.println(car22);
//        System.out.println(car22.getColor());
//        System.out.println(car22.getName());
//        System.out.println(car22.getYear());

//            Car car23 = (Car) objectInputStream.readObject();
//            System.out.println(car22);

        }
    }
}
