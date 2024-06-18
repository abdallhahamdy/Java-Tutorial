public class Main {
    public static void main(String[] args) {
        QueueUsingArrayList<Integer> queue = new QueueUsingArrayList<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue() + " dequeued from queue");
        System.out.println("Front item is " + queue.front());

        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println(queue.dequeue() + " dequeued from queue");
    }
}
