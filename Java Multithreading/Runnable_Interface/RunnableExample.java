package Runnable_Interface;

class MyRunnable_1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running. Count: " + i);
            try {
                Thread.sleep(1000); // Simulate some work with sleep
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class RunnableExample {
    public static void main(String[] args) {
        MyRunnable_1 myRunnable = new MyRunnable_1();

        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);

        thread1.start();
        thread2.start();
    }
}
