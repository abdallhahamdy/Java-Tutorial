package Doubly_Linked_List;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.append(10);
        dll.append(20);
        dll.append(30);
        dll.prepend(5);

        dll.printList(); // 5 <-> 10 <-> 20 <-> 30 <-> null

        dll.deleteNodeByValue(20);
        dll.printList(); // 5 <-> 10 <-> 30 <-> null
    }
}