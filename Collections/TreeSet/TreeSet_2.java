import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_2 {

    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Orange");
        treeSet.add("Apple");
        treeSet.add("Banana");

        // 1. Using Iterator
        System.out.println("Iterating with Iterator:");
        Iterator<String> iterator = treeSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // 2. Using Enhanced for-loop
        System.out.println("\nIterating with Enhanced for-loop:");
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }

        // 3. Using Java 8 forEach with lambda
        System.out.println("\nIterating with Java 8 forEach and lambda:");
        treeSet.forEach(fruit -> System.out.println(fruit));

        // 4. Using Java 8 Stream API
        System.out.println("\nIterating with Java 8 Stream API:");
        treeSet.stream().forEach(System.out::println);
    }

}
