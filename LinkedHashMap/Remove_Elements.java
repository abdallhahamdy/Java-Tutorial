import java.util.LinkedHashMap;
import java.util.Map;

public class Remove_Elements {

    public static void main(String[] args) {

        // Create a LinkedHashMap
        Map<String, Integer> students = new LinkedHashMap<>();

        // Add elements to the LinkedHashMap
        students.put("John", 12);
        students.put("Alice", 15);
        students.put("Bob", 14);

        System.out.println("Initial LinkedHashMap: " + students);

        // Remove the entry with key 'Alice'
        students.remove("Alice");

        System.out.println("LinkedHashMap after removing Alice: " + students);
    }
}
