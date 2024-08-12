import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Example_8 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        Set<String> synchronizedSet = Collections.synchronizedSet(set);
    }
}
