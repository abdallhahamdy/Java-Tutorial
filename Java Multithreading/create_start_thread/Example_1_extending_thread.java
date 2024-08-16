package create_start_thread;

public class Example_1_extending_thread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread running: " + i);
        }
    }

    public static void main(String[] args) {
        Example_1_extending_thread thread = new Example_1_extending_thread();
        thread.start();
    }
}
