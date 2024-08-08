import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList();
        list.add("Java");
        list.add("Python");
        list.add("JavaScript");
        list.add("C++");

        // Using Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("===========================");

        // Using Enhanced For Loop
        System.out.println("Iterating using Enhanced For Loop:");
        for (String language: list) {
            System.out.println(language);
        }

        System.out.println("===========================");

        // Using Traditional For Loop
        System.out.println("Iterating using Traditional For Loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("===========================");

        // Using forEach() method (Java 8)
        System.out.println("Iterating using forEach() method:");
        list.forEach(language -> {
            System.out.println(language);
        });

        // Using forEach() method with method reference (Java 8)
        System.out.println("Iterating using forEach() method with method reference:");
        list.forEach(System.out::println);

        // Using Stream (Java 8)
        System.out.println("Iterating using Streams:");
        list.stream().forEach(System.out::println);
    }
}
