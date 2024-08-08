package Circular_Linked_List;

class CircularLinkedList {
    private Node head;
    private Node tail;

    public CircularLinkedList() {
        head = null;
        tail = null;
    }

    // Inserting a node at the end of the list
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        tail.next = head;
    }

    // Inserting a node at the beginning of the list
    public void prepend(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        tail.next = newNode;
        head = newNode;
    }

    // Deleting a node with specific value
    public void delete(int data) {
        if (head == null) return;

        Node current = head;
        Node prev = null;

        // If head node itself holds the data to be deleted
        if (head.data == data) {
            head = head.next;
            tail.next = head;
            return;
        }

        // Searching for the data to be deleted
        while (current.data != data) {
            if (current.next == head) return;
            prev = current;
            current = current.next;
        }

        prev.next = current.next;
    }

    // Displaying the circular linked list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("HEAD");
    }
}