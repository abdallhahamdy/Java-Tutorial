public class Main {
    public static void main(String[] args) {
        QueueUsingLinkedList<Integer> queue = new QueueUsingLinkedList<>();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue() + " dequeued from queue");
        System.out.println("Front item is " + queue.front());

        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println(queue.dequeue() + " dequeued from queue");
    }
}
