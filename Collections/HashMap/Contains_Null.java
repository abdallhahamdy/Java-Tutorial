import java.util.HashMap;

public class Contains_Null {
    public static void main(String[] args) {

        // Creating a HashMap object
        HashMap<String, String> map = new HashMap<>();

        // Adding key-value pairs, including a null key and null values
        map.put("Apple", "Red");
        map.put(null, "Orange");
        map.put("Banana", null);
        map.put("Mango", "Yellow");
        map.put("Pear", null);

        System.out.println("HashMap: " + map);
    }
}
