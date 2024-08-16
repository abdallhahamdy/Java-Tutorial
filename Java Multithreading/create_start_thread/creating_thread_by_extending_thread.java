package create_start_thread;

public class creating_thread_by_extending_thread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running.");
    }

    public static void main(String[] args) {
        creating_thread_by_extending_thread thread = new creating_thread_by_extending_thread(); // create a thread object
        thread.start(); // start the thread
    }
}
