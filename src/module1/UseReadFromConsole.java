package module1;

import java.util.Scanner;

/**
 * Created by citsym on 17.04.17.
 */
public class UseReadFromConsole {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer integer = 0;
        String line = "";

        while (scanner.hasNextLine()){
            if (scanner.hasNextInt()) {
                integer = scanner.nextInt();
                line = "" + integer;
            } else {
                line = scanner.nextLine();
            }

            System.err.println(" You entered: " + line);
            System.err.println(" *10: " + 10 * integer);
        }


//        String[] arr = new String[10];
//        int count = 0;
//        while (scanner.hasNext()) {
//            String next = scanner.next();
//            if (next.equals("exit")){
//                break;
//            }
//            arr[count] = next;
//            count++;
//        }
//
//
//        System.out.println(Arrays.toString(arr));

        scanner.close();

    }

}
