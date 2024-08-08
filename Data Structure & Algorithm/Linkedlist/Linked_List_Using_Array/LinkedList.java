package Linked_List_Using_Array;

class LinkedList {
    private int[] data;
    private int[] next;
    private int head;
    private int freeIndex;

    public LinkedList(int size) {
        data = new int[size];
        next = new int[size];
        for (int i = 0; i < size - 1; i++) {
            next[i] = i + 1;
        }
        next[size - 1] = -1;
        head = -1;
        freeIndex = 0;
    }

    // Insert a new element at the beginning
    public void insert(int value) {
        if (freeIndex == -1) {
            throw new IllegalStateException("List is full");
        }

        int newIndex = freeIndex;
        freeIndex = next[newIndex];

        data[newIndex] = value;
        next[newIndex] = head;
        head = newIndex;
    }

    // Print the list
    public void printList() {
        int curr = head;
        while (curr != -1) {
            System.out.print(data[curr] + " -> ");
            curr = next[curr];
        }
        System.out.println("null");
    }
}