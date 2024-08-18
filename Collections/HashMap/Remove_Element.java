import java.util.HashMap;

public class Remove_Element {

    public static void main(String[] args) {

        // Create a HashMap object
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs to the HashMap
        map.put("Apple", 10);
        map.put("Orange", 20);
        map.put("Banana", 30);

        System.out.println("Original HashMap: " + map);

        // Remove the key-value pair with key "Apple"
        map.remove("Apple");

        System.out.println("HashMap after removing 'Apple': " + map);

        // Remove the key-value pair with key "Orange"
        map.remove("Orange");

        System.out.println("HashMap after removing 'Orange': " + map);
    }
}
