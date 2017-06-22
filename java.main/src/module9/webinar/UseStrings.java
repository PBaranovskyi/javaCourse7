package module9.webinar;

import module7.cars.Car;

/**
 * Created by citsym on 12.06.17.
 */
public class UseStrings {


    public static void main(String[] args) {
        String var1 = "Some " + "text";
        String var2 = "Some text";
        String var3 = new String("Some text");

        System.out.println(var2 == var3);

        Car varCar1 = new Car();
        Car varCar2 = varCar1;

        System.out.println(varCar1 == varCar2);

        System.out.println("Strings " + var1 == var2);
        System.out.println("Strings equals " + var1.equals(var2));


//        Integer.parseInt(var2);
        Double.parseDouble(var2);
    }


}
