package module1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by citsym on 17.04.17.
 */
public class UseBufferedReader {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String line = reader.readLine();
//
//
//        System.err.println(line);


        int read = reader.read();

        char symbol = (char) read;

        System.out.println(symbol);


        int t = 0b101011;


        System.out.println("Integer " + t);



    }
}
