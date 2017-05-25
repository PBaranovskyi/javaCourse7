package module6;

/**
 * Created by citsym on 25.05.17.
 */
public class Order {

   private long id;
   private Currency currency = Currency.USD;
   private int price;
   private String itemName;
   private String shopIndetifier;
   private User user;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getShopIndetifier() {
        return shopIndetifier;
    }

    public void setShopIndetifier(String shopIndetifier) {
        this.shopIndetifier = shopIndetifier;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", currency=" + currency +
                ", price=" + price +
                ", itemName='" + itemName + '\'' +
                ", shopIndetifier='" + shopIndetifier + '\'' +
                '}';
    }
}
