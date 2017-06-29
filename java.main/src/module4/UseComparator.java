package module4;

import java.util.*;

/**
 * Created by citsym on 18.05.17.
 */
public class UseComparator {
    public static void main(String[] args) throws CloneNotSupportedException {

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

        Book oruel = new Book("1984", "Oruel", 200);
        Book oruel2 = new Book("1984", "Oruel", 250);



        library = new HashSet<>();

        library.add(new Book("Harry Patter", "Joana Rolling", 1000));
        library.add(new Book("Vedmak", "Anjey Sapkovskey", 500));
        library.add(oruel);
        library.add(new Book("Shantaram", "Ja ne pomnyu", 600));
        library.add(new Book("Scotnyu dvor", "Oruel", 100));


        oruel.setPageCount(100);


        for (Book book : library) {
            System.out.println(book);
        }



        System.out.println(library.contains(new Book("1984", "Oruel", 100)));

        Map<Book, String> libraryMap = new HashMap<>();

        Book bookTochange = new Book("1984", "Oruel", 200);

        libraryMap.put(new Book("Harry Patter", "Joana Rolling", 1000), "Some Value");
        libraryMap.put(new Book("Vedmak", "Anjey Sapkovskey", 500), "Some Value");
        libraryMap.put(new Book("1985", "Oruel", 200), "Some Value");
        libraryMap.put(bookTochange, "Some Special Value");
        libraryMap.put(new Book("Scotnyu dvor", "Oruel", 100) ,"Some Value");

        bookTochange.setPageCount(100);


        Book copyOfThebook = (Book) bookTochange.clone();
        System.out.println("THAT is our clone" +  copyOfThebook);
        System.out.println(copyOfThebook == bookTochange);

        String specialValue = libraryMap.get(new Book("1984", "Oruel", 100));
        System.out.println(specialValue);
    }
}
