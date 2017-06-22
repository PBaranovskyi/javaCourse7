package module10;

import module4.Book;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by citsym on 29.05.17.
 */
public class UseQueue {

    public static void main(String[] args) {

        Queue<Book> books = new PriorityQueue<>((o1, o2) -> {
            return o1.getAuthorName().compareTo(o2.getAuthorName());
        });

        Book vedmak = new Book("Vedmak", "Anjey Sapkovskey", 500);
        System.out.println(vedmak);


        books.add(vedmak);
        books.add(new Book("1985", "Oruel", 200));
        books.add(new Book("1985", "Oruel", 200));
        books.add(new Book("Harry Patter", "Joana Rolling", 1000));
        books.add(new Book("Scotnyu dvor", "Oruel", 100));


        Stream<Book> uniqueValueStream = books.stream().distinct();

        List<Book> collect = uniqueValueStream.collect(Collectors.toList());



//        for (int i = 0; i < 5; i++) {
//            Book poll = books.poll();
//
//            if (poll !=null) {
//                System.out.println(poll.getName());
//            }
//        }


        for (Book book : collect) {
            System.out.println(book);
        }


    }
}
