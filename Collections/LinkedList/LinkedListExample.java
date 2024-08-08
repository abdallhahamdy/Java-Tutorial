import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.remove(1);

        System.out.println(fruits);

        fruits.remove("Mango");
        System.out.println(fruits);
    }
}
