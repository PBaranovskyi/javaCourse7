package module2;

import module1.offline.Task2;

import java.util.Locale;

/**
 * Created by citsym on 04.05.17.
 */
public class UseLoops {

    public static final int COLUMN_NUMBER = 3;
    public static final int COLUMN_WIDTH = 8;

    public static void main(String[] args) {

        int count = 150;

        for (int i = 0; i <COLUMN_NUMBER; i++) {

            if ((i + 1) % COLUMN_NUMBER == 2){
                continue;
            }

            System.out.printf(" %-" + COLUMN_WIDTH + "s ", "Column " + i);
        }

        System.out.println();

        for (int i = 0; i < count; i++) {
            if ((i + 1) % COLUMN_NUMBER == 1){
                System.out.print("  ");
            }


            if ((i + 1) % COLUMN_NUMBER == 2){
               continue;
            }
            System.out.printf(Locale.ENGLISH, " %-6.2f%s", Task2.random1(10, 20) + Math.random(), "Test");


            if ((i + 1) % COLUMN_NUMBER == 0) {
                System.out.println();
            }
        }

    }
}
