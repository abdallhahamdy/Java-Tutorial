import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");
        System.out.println(fruits.lastIndexOf("Apple"));
    }
}
