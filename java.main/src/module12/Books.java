package module12;

import module4.Book;

/**
 * Created by citsym on 26.06.17.
 */
public class Books {

    public static void main(String[] args) {

        Book oruel = new Book("1984", "Oruel", 200);
        Book oruel2 = new Book("1985", "Oruel", 250);


        System.out.println(oruel.equals(oruel2));

        System.out.println(oruel.hashCode());
        System.out.println(oruel2.hashCode());


        String var1 = "Oruel";
        String var2 = "Oruel";
        String var32 = "el";
        String var31 = "Oru";
        String var3 = var31 + var32;

        System.out.println(var1 == var3);

        compareStrings(var1, var2);
        compareStrings(var1, var3);



    }

    private static void compareStrings(String var1, String var2) {
        System.out.println(var1 == var2);
    }
}
