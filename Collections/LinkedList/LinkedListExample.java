import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        List<String> subList = fruits.subList(1, 3);
        System.out.println(subList);
    }
}
