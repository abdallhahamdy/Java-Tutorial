package create_start_thread;

public class Example_3_Using_Lambda {
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread running: " + i);
            }
        };
        Thread thread = new Thread(task);
        thread.start();
    }
}
