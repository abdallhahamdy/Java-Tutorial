import java.util.HashSet;
import java.util.Iterator;

public class Example_4 {
    public static void main(String[] args) {

        // Creating a HashSet
        HashSet<String> set = new HashSet<>();

        // Adding new elements to the HashSet
        set.add("Java");
        set.add("Python");
        set.add("JavaScript");

        // Accessing elements using an iterator
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String language = iterator.next();
            System.out.println(language);
        }
    }
}
