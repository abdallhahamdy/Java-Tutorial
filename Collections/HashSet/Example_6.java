import java.util.HashSet;
import java.util.Iterator;

public class Example_6 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("element 1");
        set.add("element 2");
        set.add("element 3");
        set.add("element 4");

//        for (String str : set) {
//            System.out.println("only forward direction ---" + str);
//        }

//        Iterator<String> iterator = set.iterator();
//        iterator.forEachRemaining(str -> System.out.println(" only forward direction ---" +str));

        set.forEach(str -> System.out.println(" only forward direction ---" + str));
    }
}
