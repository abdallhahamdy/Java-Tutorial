import java.util.HashMap;

public class Size {

    public static void main(String[] args) {

        // Creating a HashMap object
        HashMap<String, String> map = new HashMap<>();

        // Adding key-value pairs to the map
        map.put("Apple", "Red");
        map.put("Orange", "Orange");
        map.put("Banana", "Yellow");
        map.put("Mango", "Yellow");

        System.out.println("Original HashMap: " + map);

        // Getting the size of the map
        int size = map.size();

        System.out.println("Size of the HashMap: " + size);
    }
}
