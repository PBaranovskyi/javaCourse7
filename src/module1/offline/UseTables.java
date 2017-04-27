package module1.offline;

import module1.Table;

/**
 * Created by citsym on 27.04.17.
 */
public class UseTables {

    public static void main(String[] args) {

        Table myTable = new Table();

        myTable.rollTheTable(100);
        myTable.rollTheTable(10);
        myTable.rollTheTable(30);
        myTable.rollTheTable(1);

        Table mashasTable = new Table();
        mashasTable.rollTheTable(500);




    }
}
