package module12;

import module4.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by citsym on 19.06.17.
 */
public class UseIterator {


    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();


        Book vedmak = new Book("Vedmak", "Anjey Sapkovskey", 500);
        books.add(vedmak);
        books.add(new Book("1985", "Oruel", 200));
        books.add(new Book("1985", "Oruel", 200));
        books.add(new Book("Harry Patter", "Joana Rolling", 1000));
        books.add(new Book("Scotnyu dvor", "Oruel", 100));



//        for (Book book : books) {
//            if (book.getName().equals("1985")) {
//                books.remove(book);
//            }
//
//            System.out.println(book.getAuthorName());
//        }

        books.removeIf(book -> {

            return  book.getName().equals("1985");
        });

        System.gc();

//        for (int i = books.size() - 1; i >= 0; i--) {
//            if (books.get(i).getName().equals("1985")) {
//                books.add(i, vedmak);
//            }
//        }

        System.out.println(books);


        Object[] objects = books.toArray();

    }
}
