import java.util.ArrayList;

public class QueueUsingArrayList<T> {

    private ArrayList<T> list = new ArrayList<T>();

    // Adds value at the end of available space.
    public void enqueue(T value) {
        list.add(value);
    }

    // Removes the first item
    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        return list.remove(0);
    }

    // Checks if the queue is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Returns the first item without removing it.
    public T front() {
        return list.get(0);
    }
}
