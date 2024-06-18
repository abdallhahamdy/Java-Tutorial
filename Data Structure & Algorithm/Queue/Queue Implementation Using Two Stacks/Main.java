public class Main {
    public static void main(String[] args) {
        QueueUsingStacks<Integer> queue = new QueueUsingStacks<>();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue() + " dequeued from queue");

        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println(queue.dequeue() + " dequeued from queue");
    }
}
