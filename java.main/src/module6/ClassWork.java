package module6;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by citsym on 25.05.17.
 */
public class ClassWork {

    static String[] itemNames = {"колбаса", "печеньки", "сочок", "ананас", "вино", "салат", "хлеб", "помидоры"};
    static String[] firstNames = {"Иван", "Настя", "Вова", "Даша", "Оля", "Петя", "Максим", "Андрей"};
    static String[] lastNames = {"Дулин", "Петров", "Сидоров", "Васечкин", "Григорьев", "Остапенко", "Дорошенко", "Кузмин"};

    public static void main(String[] args) {

        // prepare test data
        List<Order> ordersList = getOrderList(10);

        for (Order order : ordersList) {
            System.out.println(order);
            System.out.println(order.getUser());
        }
    }

    private static List<Order> getOrderList(int count) {
        List<Order> orders = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            orders.add(generateOrder(i));
        }
        return orders;
    }

    private static Order generateOrder(int id) {
        Order order = new Order();
        order.setId(id);

        int randomItemNameIndex = (int) (Math.random() * itemNames.length);
        order.setItemName(itemNames[randomItemNameIndex]);

        order.setPrice(id * (int)(Math.random() * 1000));


        int randomCurrencyIndex = (int) (Math.random() * Currency.values().length);
        order.setCurrency(Currency.values()[randomCurrencyIndex]);

        order.setShopIndetifier(UUID.randomUUID().toString());

        order.setUser(generateUser(id));

        return order;
    }

    private static User generateUser(int id) {
        User user = new User();
        user.setId(id);
        user.setBalance(id * (int)(Math.random() * 10000));


        int randomFirstNameIndex = (int) (Math.random() * firstNames.length);
        user.setFirstName(firstNames[randomFirstNameIndex]);

        int randomLastNameIndex = (int) (Math.random() * lastNames.length);
        user.setLastName(lastNames[randomLastNameIndex]);

        int randomCityIndex = (int) (Math.random() * City.values().length);
        user.setCity(City.values()[randomCityIndex].name());


        return user;
    }
}
