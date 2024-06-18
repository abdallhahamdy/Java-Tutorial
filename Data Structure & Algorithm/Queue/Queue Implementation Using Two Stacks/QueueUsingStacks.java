import java.util.Stack;

public class QueueUsingStacks {
    private Stack<T> stack1;
    private Stack<T> stack2;

    public QueueUsingStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(T data) {
        stack1.push(data);
    }

    public T dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return stack2.pop();
    }
}
