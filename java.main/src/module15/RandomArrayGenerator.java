package module15;

import java.util.Random;

/**
 * Created by citsym on 10.07.17.
 */
public class RandomArrayGenerator {


    @MyAnnotation("3")
    private static int[] generate(int size){

        Random random = new Random();

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i]  = random.nextInt();
        }

        return array;
    }




    @MyAnnotation
    private static int[] generate(){

        Random random = new Random();

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i]  = random.nextInt();
        }

        return array;
    }
}
