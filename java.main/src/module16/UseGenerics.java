package module16;

import module4.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by citsym on 13.07.17.
 */
public class UseGenerics {

    public static void main(String[] args) {

        Integer[] arrayInt = {4, 5, 20, 3, 44, 12};

        long count = calcNum(arrayInt, 5);

        System.out.println(count);

        String[] arrayString = {"alice", "Poul", "Nick", "Zemfira"};

//        String[] strings = Arrays.stream(arrayString)
//                .map(String::toLowerCase)
//                .toArray(String[]::new);

        long num = calcNum(arrayString, "Nastya");

        System.out.println(num);


        List<Book> books = new ArrayList<>();
        Book vedmak = new Book("   Vedmak        ", "Anjey Sapkovskey", 500);
        books.add(vedmak);
        books.add(new Book("1985", "Oruel", 200));
        books.add(new Book("1985", "Oruel", 200));
        books.add(new Book("Harry Patter ", "Joana Rolling", 1000));
        books.add(new Book("Scotnyu dvor        ", "Oruel", 100));

        long calcNum = calcNum(books.toArray(new Book[0]), vedmak);

        System.out.println(calcNum);

        String[] names = books.stream().map(Book::getName).toArray(String[]::new);
        String[] filteredNAmes = filterLongNames(names);

        System.out.println(Arrays.toString(filteredNAmes));

    }

    public static <T extends Comparable<T>> long calcNum(T[] array, T maxElement) {

//        long count = 0;


//        for (T item : array) {
//            if (item.compareTo(maxElement) > 0) {
//                count++;
//            }
//        }

        return Arrays.stream(array)
                .filter((item) -> item.compareTo(maxElement) > 0)
                .count();
    }


    public static String[] filterLongNames(String[] originNames) {

//        List<String> filteredList = new ArrayList<>();
//
//        for (String originName : originNames) {
//            if (originName.trim().split(" ").length == 1){
//                filteredList.add(originName);
//            }
//        }

//        return filteredList.toArray(new String[0]);

        return Arrays.stream(originNames)
                .map(String::trim)
                .filter(UseGenerics::isOneWord)
                .toArray(String[]::new);

    }

    private static boolean isOneWord(String item) {
        return item.split(" ").length == 1;
    }


}
