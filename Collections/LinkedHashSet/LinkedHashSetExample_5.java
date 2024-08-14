import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample_5 {

    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Add elements to the LinkedHashSet
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");

        // Using Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = linkedHashSet.iterator();
        while(iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        // Using for-each loop
        System.out.println("\nIterating using for-each loop:");
        for(String element : linkedHashSet) {
            System.out.println(element);
        }

        // Using Java 8's forEach method
        System.out.println("\nIterating using Java 8's forEach method:");
        linkedHashSet.forEach(element -> {
            System.out.println(element);
        });

        // Using Java 8's Stream API
        System.out.println("\nIterating using Java 8's Stream API:");
        linkedHashSet.stream().forEach(System.out::println);
    }
}
