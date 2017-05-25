package module4;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by citsym on 18.05.17.
 */
public class UseMap {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("Пугачев Н,П", 1);
        map.put("Алеев К,Т", 4);
        map.put("Мирон В,О", 10);
        map.put("Никитина Т,П", 30);
        map.put("Олька А,Ц", null);
        map.put("Мирон В,О", 15);


        System.out.println(map.get("Мирон В,О") + " number of kinder garden");


    }
}
