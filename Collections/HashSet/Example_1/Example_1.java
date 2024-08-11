package Example_1;

import java.util.HashSet;

public class Example_1 {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> set = new HashSet<>();

        // Adding new elements to the HashSet
        set.add("Java");
        set.add("Python");
        set.add("JavaScript");

        // Displaying the HashSet elements
        for(String language : set){
            System.out.println(language);
        }
    }
}
