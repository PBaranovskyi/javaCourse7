package module1.offline;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

/**
 * Created by citsym on 27.04.17.
 */
public class Task2 {

    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        double[] c = new double[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = random1(10, 20);
            b[i] = random2(30, 40);

            c[i] = Math.sqrt(a[i] * a[i] + b[i] * b[i]);

//            c[i] =  (int) (c[i] * 100 )/ 100.0;

            c[i] = new BigDecimal(c[i]).setScale(2, RoundingMode.HALF_UP).doubleValue();
            System.out.println(a[i] + " " + b[i] + " " + c[i]);
        }

        Object[][] twoDimentional = new Object[5][10];

        Object[] intObj = new Object[5];
        intObj[1] = new Integer(503);

        int value = (int) intObj[1];

        System.out.println(value);

//        twoDimentional[0] = a;
//        twoDimentional[1] = b;
//        twoDimentional[2] = a;




    }

    private static int random1(int lowBound, int highBound) {
        double random = lowBound + Math.random() * (highBound - lowBound);
        return (int) random;
    }

    private static int random2(int lowBound, int highBound) {

        Random generator = new Random();
        return lowBound + generator.nextInt(highBound - lowBound);
    }

}
