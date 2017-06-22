package module9.webinar;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by citsym on 12.06.17.
 */
public class UseConsoleInt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println(getIntFromScanner(scanner));
//        scanner.next();


        long before = System.currentTimeMillis();
        long nanoBefore = System.nanoTime();
        while (scanner.hasNextLine()){
            try {
                System.out.println(Integer.parseInt(scanner.nextLine()));
                break;
            } catch (NumberFormatException e){
                System.out.println("Try once more time");
            }
        }
        long after = System.currentTimeMillis();
        long nanoAfter = System.nanoTime();

        System.out.println("Time spend on method is :" + (after - before) + "ms" + (nanoAfter-nanoBefore) + " nanos");


    }

    static int getIntFromScanner(Scanner scanner) {
        int i;
        try {
            i = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input! Please try again!");
            scanner.next();
            i = getIntFromScanner(scanner);
        }
        return i;
    }
}
