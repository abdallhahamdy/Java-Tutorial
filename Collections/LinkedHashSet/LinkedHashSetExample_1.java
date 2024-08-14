import java.util.LinkedHashSet;

public class LinkedHashSetExample_1 {
    public static void main(String args[]) {
        // Create a new LinkedHashSet of strings
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();

        // Add elements to the LinkedHashSet
        linkedHashSet.add("Apple");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Pineapple");
        linkedHashSet.add("Apple"); // This will not be inserted as "Apple" is already present in the set

        // Try to add a null value
        linkedHashSet.add(null);
        linkedHashSet.add(null); // This will not be inserted as null is already present in the set

        // Print the LinkedHashSet
        System.out.println(linkedHashSet); // Outputs: [Apple, Orange, Banana, Pineapple, null]
    }
}
