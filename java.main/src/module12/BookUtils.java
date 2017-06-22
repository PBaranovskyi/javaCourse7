package module12;

import module4.Book;

/**
 * Created by citsym on 19.06.17.
 */
public class BookUtils {

    public static void readBook(Book book) throws InterruptedException {
        while (book.getPageCount() != 0) {
            System.out.println("read page: " + book.getPageCount());
            Thread.sleep(50);
            book.setPageCount(book.getPageCount() - 1);
        }

    }


    public static String readString(String someImutable) {

        return someImutable.replaceAll("e", "a");
    }

}
