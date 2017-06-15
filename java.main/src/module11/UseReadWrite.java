package module11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by citsym on 15.06.17.
 */
public class UseReadWrite {

    public static void main(String[] args) throws FileNotFoundException {

        Map<String, String> map = new HashMap<>();
        map.put("и", "і");
        map.put("но", "але");


        BufferedReader bf = new BufferedReader(new FileReader("java.main/src/module11/textRus.txt"));

        bf.lines().forEach(
                line ->
                {

                    System.out.println(line.replaceAll("[\\s\\p{Punct}]?\\W+[\\s\\p{Punct}]?", "пошлоПоехало"));
//                    String[] words = line.split("[\\p{Punct}\\s]");
//                    Arrays.stream(words).forEach(word -> {
//                        String transform = map.get(word) != null ? map.get(word) : word;
//                        System.out.println(transform);
//                    });
                }
        );

    }
}
