import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList();
        fruits.add("Apple");
        fruits.addAll(Arrays.asList("Banana", "Mango"));
        fruits.set(1, "Orange");
        System.out.println(fruits);
    }
}
