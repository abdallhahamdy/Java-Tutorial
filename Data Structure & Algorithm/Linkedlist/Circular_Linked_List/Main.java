package Circular_Linked_List;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.append(10);
        cll.append(20);
        cll.append(30);
        cll.prepend(5);

        cll.display();  // 5 -> 10 -> 20 -> 30 -> HEAD

        cll.delete(20);
        cll.display();  // 5 -> 10 -> 30 -> HEAD
    }
}