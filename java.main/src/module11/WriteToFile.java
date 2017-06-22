package module11;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by citsym on 19.06.17.
 */
public class WriteToFile {

    public static void main(String[] args) throws IOException {

        try ( BufferedWriter bw = new BufferedWriter(new FileWriter("java.main/src/module11/toWrite2.txt"))) {

            bw.write("I`m writing the line into file");
            bw.newLine();

            someMethod();
            bw.write("I`m writing the second line into file");

        } catch (FileNotFoundException e){

            System.out.println("File does not exist");
//            e.printStackTrace();
        }

    }

    private static void someMethod() {
        throw new NullPointerException();
    }
}
