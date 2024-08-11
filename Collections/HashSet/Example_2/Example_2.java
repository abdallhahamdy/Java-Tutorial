package Example_2;

import java.util.HashSet;

public class Example_2 {
    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<>();

        // Adding elements to the HashSet
        hset.add("Apple");
        hset.add("Mango");
        hset.add("Grapes");
        hset.add("Orange");
        hset.add("Fig");

        // Addition of duplicate elements
        hset.add("Apple");
        hset.add("Mango");

        // Addition of null values
        hset.add(null);
        hset.add(null);

        // Displaying HashSet elements
        System.out.println(hset);
    }
}
