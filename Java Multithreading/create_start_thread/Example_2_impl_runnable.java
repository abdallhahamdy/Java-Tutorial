package create_start_thread;

public class Example_2_impl_runnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread running: " + i);
        }
    }

    public static void main(String[] args) {
        Example_2_impl_runnable myRunnable = new Example_2_impl_runnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}
