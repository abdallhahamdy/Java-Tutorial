import java.util.Arrays;
import java.util.HashSet;

public class Example_5 {
    public static void main(String[] args) {

        // Creating a HashSet
        HashSet<String> set = new HashSet<>();
        set.addAll(Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry"));

        System.out.println("Original HashSet: " + set);

        // Using remove(Object o)
        set.remove("Cherry");
        System.out.println("\nAfter remove('Cherry'): " + set);

        // Using removeAll(Collection c)
        set.removeAll(Arrays.asList("Apple", "Banana"));
        System.out.println("\nAfter removeAll(Arrays.asList('Apple', 'Banana')): " + set);

        // Using removeIf(Predicate<? super E> filter)
        set.removeIf(fruit -> fruit.startsWith("E"));
        System.out.println("\nAfter removeIf(fruit -> fruit.startsWith('E')): " + set);
    }
}
