package module7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by citsym on 05.06.17.
 */
public class UseFile {

    public static void main(String[] args) throws IOException {
//        String absoluteFilePath = "/Users/citsym/gitRepos/javaCourse7/java.main/src/module7/Home_Work";
        String filePath = "java.main/src/module7/Home_Work";
        filePath =  filePath.replaceAll("/", System.getProperty("file.separator"));


        FileReader fileReader = null;
        try {
            fileReader = new FileReader(filePath);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        int value;
        do {
            value = fileReader.read();

            System.out.print((char) value);

        } while (value != -1);
    }
}
