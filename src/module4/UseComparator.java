package module4;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by citsym on 18.05.17.
 */
public class UseComparator {
    public static void main(String[] args) {

        Set<String> familySet = new TreeSet<>();
        familySet.add("Пугачев Н,П");
        familySet.add("Алеев К,Т");
        familySet.add("Мирон В,О");
        familySet.add("Никитина Т,П");
        familySet.add("Олька А,Ц");


        System.out.println(familySet);


        Set<Book> library = new TreeSet<>(new Comparator<Book>() {

            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageCount() - o2.getPageCount();
            }
        });


        library.add(new Book("Harry Patter", "Joana Rolling", 1000));
        library.add(new Book("Vedmak", "Anjey Sapkovskey", 500));
        library.add(new Book("1984", "Oruel", 200));
        library.add(new Book("Shantaram", "Ja ne pomnyu", 600));
        library.add(new Book("Scotnyu dvor", "Oruel", 100));

        for (Book book : library) {
            System.out.println(book);
        }
    }
}
