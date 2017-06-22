package module12;

import module4.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static module12.BookUtils.readString;

/**
 * Created by citsym on 19.06.17.
 */
public class UseImmutable {

    public static void main(String[] args) {

        Book book = new Book("1985", "Oruel", 200);

//        readBook(book);

        // === no garanties the same condition!!
        System.out.println("Book " + book.getName() + " time to read one page : " + 120 / book.getPageCount());

        String someImutable = "New String";

        readString(someImutable);

        System.out.println(someImutable);


        List<Book> books = new ArrayList<>();


        Book vedmak = new Book("Vedmak", "Anjey Sapkovskey", 500);
        books.add(vedmak);
        books.add(new Book("1985", "Oruel", 200));
        books.add(new Book("1985", "Oruel", 200));
        books.add(new Book("Harry Patter", "Joana Rolling", 1000));
        books.add(new Book("Scotnyu dvor", "Oruel", 100));


        List<Book> unmodifiableList = Collections.unmodifiableList(books);

        unmodifiableList.get(0).setPageCount(0);

        System.out.println(unmodifiableList);
    }



}
