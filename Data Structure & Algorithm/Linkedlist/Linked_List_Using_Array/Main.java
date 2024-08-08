package Linked_List_Using_Array;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(5);

        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.printList(); // 30 -> 20 -> 10 -> null
    }
}