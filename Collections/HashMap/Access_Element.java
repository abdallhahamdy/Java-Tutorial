import java.util.HashMap;

public class Access_Element {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Orange", 20);
        map.put("Banana", 30);

        // Access the value corresponding to the key "Apple"
        Integer appleValue = map.get("Apple");
        System.out.println("Value for 'Apple': " + appleValue);

        // Access the value corresponding to the key "Orange"
        Integer orangeValue = map.get("Orange");
        System.out.println("Value for 'Orange': " + orangeValue);

        // Access the value corresponding to the key "Banana"
        Integer bananaValue = map.get("Banana");
        System.out.println("Value for 'Banana': " + bananaValue);
    }
}
