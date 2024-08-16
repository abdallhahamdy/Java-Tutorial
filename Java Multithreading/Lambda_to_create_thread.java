public class Lambda_to_create_thread {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("Thread is running.");
        Thread thread = new Thread(task);
        thread.start();
    }
}
