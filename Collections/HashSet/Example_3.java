import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Example_3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(6);
        list2.add(9);
        list2.add(12);
        list2.add(15);

        // Creating a HashSet from another collection (ArrayList)
        Set<Integer> set = new HashSet<>(list);

        // Adding all the elements from an existing collection to a HashSet
        set.addAll(list2);

        System.out.println(set);

    }
}
