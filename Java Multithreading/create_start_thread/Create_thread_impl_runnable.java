package create_start_thread;

public class Create_thread_impl_runnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running.");
    }

    public static void main(String[] args) {
        Create_thread_impl_runnable myRunnable = new Create_thread_impl_runnable(); // Create a runnable object
        Thread thread = new Thread(myRunnable); // Pass the runnable object to a Thread object
        thread.start(); // Start the thread
    }
}
