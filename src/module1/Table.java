package module1;

/**
 * Created by citsym on 27.04.17.
 */
public class Table {

    String color = "White";
    static int sumDistance = 0;

    public void rollTheTable(int distance){
        sumDistance +=  distance;
        System.out.println("Table replaced " + distance );
        System.out.println("Sum distance " + sumDistance );
    }
}
