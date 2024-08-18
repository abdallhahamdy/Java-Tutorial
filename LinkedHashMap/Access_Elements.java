import java.util.LinkedHashMap;
import java.util.Map;

public class Access_Elements {

    public static void main(String[] args) {

        // Create a LinkedHashMap
        Map<String, Integer> students = new LinkedHashMap<>();

        // Add elements to the LinkedHashMap
        students.put("John", 12);
        students.put("Alice", 15);
        students.put("Bob", 14);

        // Access elements from the LinkedHashMap
        int johnAge = students.get("John");
        int aliceAge = students.get("Alice");
        int bobAge = students.get("Bob");

        System.out.println("John's Age: " + johnAge);
        System.out.println("Alice's Age: " + aliceAge);
        System.out.println("Bob's Age: " + bobAge);
    }
}
