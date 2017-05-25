package module3.questions;

/**
 * Created by citsym on 15.05.17.
 */
public class UseStrings {

    public static void main(String[] args) {


        String value1 = "Test";
        String value2 = "1";
        String value3 = "Test";

        System.out.println(value1 == value3);
        System.out.println(value1+value2 == value1+value2);
        System.out.println((value1+value2).equals(value1+value2));




    }
}
