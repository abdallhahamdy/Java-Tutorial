import java.util.LinkedList;

public class QueueUsingLinkedList<T> {

    private LinkedList<T> list = new LinkedList<T>();

    // Add item to the end of the list
    public void enqueue(T item) {
        list.addLast(item);
    }

    // Remove and return item from the front
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.removeFirst();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // View the item at the front
    public T front() {
        return list.peekFirst();
    }
}
