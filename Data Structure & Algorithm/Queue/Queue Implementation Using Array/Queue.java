public class Queue {
    private int front, rear, size;
    private int capacity;
    private int[] array;

    public Queue(int capacity) {
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        array = new int[this.capacity];
    }

    // Enqueue function
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        rear = (rear + 1) % capacity;
        array[rear] = item;
        size++;
    }

    // Dequeue function
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return Integer.MIN_VALUE;
        }
        int item = array[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    // Check if the queue is full
    public boolean isEmpty() {
        return (size == 0);
    }

    // Check if the queue is full
    public boolean isFull() {
        return (size == capacity);
    }

    // Get the front item
    public int front() {
        if (isEmpty())
            return Integer.MIN_VALUE;
        return array[front];
    }
}