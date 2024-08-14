import java.util.LinkedHashSet;

public class LinkedHashSetExample_4 {
    public static void main(String[] args) {
        // Create a LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();

        // Add elements to LinkedHashSet
        linkedHashSet.add("Apple");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Pineapple");

        // Display the LinkedHashSet
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // Check if the LinkedHashSet contains "Apple"
        boolean found = linkedHashSet.contains("Apple");
        System.out.println("Is Apple in the LinkedHashSet? " + found);

        // Check if the LinkedHashSet contains "Grapes"
        found = linkedHashSet.contains("Grapes");
        System.out.println("Is Grapes in the LinkedHashSet? " + found);
    }
}
