import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        ListIterator<String> listIterator = fruits.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
