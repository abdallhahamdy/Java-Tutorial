import java.util.LinkedHashSet;

public class LinkedHashSetExample_3 {
    public static void main(String args[]) {
        // Create a new LinkedHashSet of strings
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();

        // Add elements to the LinkedHashSet
        linkedHashSet.add("Apple");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Pineapple");

        // Print the original LinkedHashSet
        System.out.println("Original LinkedHashSet: " + linkedHashSet);

        // Remove the "Orange" element
        linkedHashSet.remove("Orange");

        // Print the LinkedHashSet after removing "Orange"
        System.out.println("LinkedHashSet after removing Orange: " + linkedHashSet);

        // If you try to remove an element which does not exist, it will not throw an error.
        // It will simply return false.
        boolean isRemoved = linkedHashSet.remove("Grapes");
        System.out.println("Is Grapes removed: " + isRemoved);

        // Clear all elements from the LinkedHashSet
        linkedHashSet.clear();

        // Print the LinkedHashSet after clearing all elements
        System.out.println("LinkedHashSet after clearing all elements: " + linkedHashSet);
    }
}
