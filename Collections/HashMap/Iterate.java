import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Iterate {

    public static void main(String[] args) {

        // Creating a HashMap
        HashMap<String, String> map = new HashMap<>();
        map.put("Apple", "Red");
        map.put("Orange", "Orange");
        map.put("Banana", "Yellow");

        // Using 'entrySet' and a 'for-each' loop:
        System.out.println("Using 'entrySet' and a 'for-each' loop:");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
        System.out.println();

        System.out.println("--------------------------------");

        // Using 'keySet' and a 'for-each' loop:
        System.out.println("Using 'keySet' and a 'for-each' loop:");
        for (String key : map.keySet()) {
            System.out.println("Key = " + key + ", Value = " + map.get(key));
        }
        System.out.println();

        System.out.println("--------------------------------");

        // Using 'values' and a 'for-each' loop
        System.out.println("Using 'values' and a 'for-each' loop:");
        for (String value : map.values()) {
            System.out.println("Value = " + value);
        }
        System.out.println();

        System.out.println("--------------------------------");

        // Using an 'Iterator'
        System.out.println("Using an 'Iterator': ");
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
        System.out.println();

        System.out.println("--------------------------------");

        // Using Java 8's 'forEach' method
        System.out.println("Using Java 8's 'forEach' method:");
        map.forEach((key, value) -> System.out.println("Key = " + key + ", Value = " + value));
    }
}
