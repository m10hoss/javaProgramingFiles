package Section9DataStructure;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {
    public static void main(String[] args) {
        //Stores in pair, key -> value : Entry
        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "BMW");
        map.put(6, "Aidi");
        map.put(4, "hond");

        String value1 = map.get(2);
        System.out.println(value1);

        // Keys are unique, value can be duplicated

        map.put(2, "BMW");
        // when value is repeated, string is overridden

        String value2 = map.get(2);
        System.out.println(value2);

        Map<String, String> cars = new HashMap<String, String>();


        cars.put("make", "tesla");
        cars.put("model", "S");
        cars.put("year", "2019");
        cars.put("owner", "no one");
        cars.put("status", "clean");

        String carInfo = cars.get("model");
        System.out.println(carInfo);

    }
}

