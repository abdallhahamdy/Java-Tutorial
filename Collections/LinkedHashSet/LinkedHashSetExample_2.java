import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample_2 {
    public static void main(String args[]) {
        // Create a new LinkedHashSet of strings
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();

        // Add elements to the LinkedHashSet
        linkedHashSet.add("Apple");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Pineapple");

        // Create an iterator
        Iterator<String> iterator = linkedHashSet.iterator();

        // Print the LinkedHashSet using the iterator
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Alternatively, you can also use the for-each loop to access elements
        System.out.println("\nIterating using for-each loop: ");
        for(String fruit : linkedHashSet) {
            System.out.println(fruit);
        }
    }
}
