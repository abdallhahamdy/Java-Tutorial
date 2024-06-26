/**
 * Queue Implementation using Circular Array
 * @author Abdallha
 *
 */
public class FixedSizeArrayQueue {
    // Array used to implement the queue.
    private int[] queueRep;
    private int size, front, rear;

    // Length of the array used to implement the queue.
    private static final int CAPACITY = 16; // Default Queue size

    // Initializes the queue to use an array of default length.
    public FixedSizeArrayQueue(){
        queueRep = new int[CAPACITY];
        size = 0; front = 0; rear = 0;
    }

    // Initializes the queue to use an array of given length.
    public FixedSizeArrayQueue(int cap){
        queueRep = new int[cap];
        size = 0; front = 0; rear = 0;
    }

    // Inserts an element at the rear of the queue. This method runs in O(1) time.
    public void enQueue(int data) throws NullPointerException, IllegalStateException {
        if (size == CAPACITY)
            throw new IllegalStateException("Queue is full: Overflow");
        else {
            size++;
            queueRep[rear] = data;
            rear = (rear+1) % CAPACITY;
        }
    }

    // Removes the front element from the queue. This method runs in O(1) time.
    public int deQueue() throws IllegalStateException {
        // Effects: If queue is empty, throw IllegalStateException,
        // else remove and return oldest element of this
        if (size == 0)
            throw new IllegalStateException("Queue is empty: underflow");
        else {
            size--;
            int data = queueRep [ (front % CAPACITY) ];
            queueRep [front] = Integer.MIN_VALUE;
            front = (front+1) % CAPACITY;
            return data;
        }
    }

    // Checks whether the queue is empty. This method runs in O(1) time.
    public boolean isEmpty(){
        return (size == 0);
    }

    // Checks whether the queue is full. This method runs in O(1) time.
    public boolean isFull(){
        return (size == CAPACITY);
    }

    // Returns a string representation of the queue as a list of elements, with
    // the front element at the end: [ ... , prev, rear ]. This method runs in O(n)
    // time, where n is the size of the queue.
    public String toString(){
        String result = "[";
        for (int i = 0; i < size; i++){
            result += Integer.toString(queueRep[ (front + i) % CAPACITY ]);
            if (i < size - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }

    public static void main(String[] args) {
        FixedSizeArrayQueue arrayQueue = new FixedSizeArrayQueue();
        arrayQueue.enQueue(10);
        arrayQueue.enQueue(20);
        arrayQueue.enQueue(30);
        arrayQueue.enQueue(40);
        arrayQueue.enQueue(50);
        arrayQueue.enQueue(60);
        arrayQueue.enQueue(70);
        arrayQueue.enQueue(80);
//        arrayQueue.enQueue(90);
//        arrayQueue.deQueue();
        arrayQueue.enQueue(100);
        arrayQueue.enQueue(101);
        arrayQueue.enQueue(102);
        arrayQueue.enQueue(103);
        arrayQueue.enQueue(104);
        arrayQueue.enQueue(105);
        arrayQueue.enQueue(106);
        arrayQueue.enQueue(107);
        arrayQueue.enQueue(108);
        System.out.println(arrayQueue.toString());
    }
}

/**
 * Space Complexity (for n enQueue operations) O(n)
 * Time Complexity of enQueueQ O(1)
 * Time Complexity of deQueueQ O(1)
 * Time Complexity of isEmpty() O(1)
 * Time Complexity of isFull() O(1)
 * Time Complexity of getQueueSize() O(1)
 */
