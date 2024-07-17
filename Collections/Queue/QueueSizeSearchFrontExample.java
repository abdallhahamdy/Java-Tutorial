import java.util.LinkedList;
import java.util.Queue;

public class QueueSizeSearchFrontExample {
    public static void main(String[] args) {
        Queue<String> elementQueue = new LinkedList<>();

        elementQueue.add("element1");
        elementQueue.add("element2");
        elementQueue.add("element3");
        elementQueue.add("element4");

        System.out.println("WaitingQueue : " + elementQueue);

        // Check is a Queue is empty
        System.out.println("is waitingQueue empty? : " + elementQueue.isEmpty());

        // Find the size of the queue
        System.out.println("Size of waitingQueue : " + elementQueue.size());

        // Check if the queue contains an element
        String name = "Johnny";
        if (elementQueue.contains(name)) {
            System.out.println("WaitingQueue contains " + name);
        } else {
            System.out.println("Waiting Queue doesn't contain " + name);
        }

        // Get the element at the front of the Queue without removing it using element()
        // The element() method throws NoSuchElementException if the Queue is empty
        
    }
}
