import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
