package module1.offline;

import java.math.BigDecimal;

/**
 * Created by citsym on 27.04.17.
 */
public class Task1 {

    public static void main(String[] args) {
        String[] products = {"Хлеб", "Колбаса", "Мясо", "Сыр", "Молоко", "Капуста"};
        BigDecimal[] price = new BigDecimal[6];
        price[0] = new BigDecimal(8.5);
        price[1] = new BigDecimal(3.8);
        price[2] = new BigDecimal(4.6);
        price[3] = new BigDecimal(12.0);
        price[4] = new BigDecimal(23.23);
        price[5] = new BigDecimal(18.15);


        BigDecimal sum = new BigDecimal(0);

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i] + " " + price[i].doubleValue());
            sum = sum.add(price[i]);
        }

        BigDecimal average = sum.divide(new BigDecimal(products.length), 2,  BigDecimal.ROUND_HALF_UP);


        System.out.println("Average " + average);


    }
}
