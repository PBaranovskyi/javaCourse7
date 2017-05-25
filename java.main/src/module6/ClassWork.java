package module6;

import java.util.*;

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

        ordersList.get(5).setPrice(ordersList.get(3).getPrice());

        Collections.sort(ordersList, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {

                if (o1.getItemName().equals("сочок")) {
                    return -1;
                }

                if (o2.getItemName().equals("сочок")) {
                    return 1;
                }

                if (o1.getPrice() == o2.getPrice()) {
                    return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                }

                return o1.getPrice() - o2.getPrice();
            }
        });

//        ordersList.sort(Comparator.comparing(Order::getPrice)
//                .thenComparing((o1, o2) -> o1.getUser().getCity().compareTo(o2.getUser().getCity())));

//        ordersList.sort(
//                Comparator
//                        .comparing(Order::getPrice)
//                        .thenComparing(Order::getItemName,
//                                Comparator.<String>naturalOrder().reversed()));


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

        order.setPrice(id * (int) (Math.random() * 1000));


        int randomCurrencyIndex = (int) (Math.random() * Currency.values().length);
        order.setCurrency(Currency.values()[randomCurrencyIndex]);

        order.setShopIndetifier(UUID.randomUUID().toString());

        order.setUser(generateUser(id));

        return order;
    }

    private static User generateUser(int id) {
        User user = new User();
        user.setId(id);
        user.setBalance(id * (int) (Math.random() * 10000));


        int randomFirstNameIndex = (int) (Math.random() * firstNames.length);
        user.setFirstName(firstNames[randomFirstNameIndex]);

        int randomLastNameIndex = (int) (Math.random() * lastNames.length);
        String randomLastName = lastNames[randomLastNameIndex];
        user.setLastName(randomLastName);

        int randomCityIndex = (int) (Math.random() * City.values().length);
        user.setCity(City.values()[randomCityIndex].name());


        return user;
    }
}
