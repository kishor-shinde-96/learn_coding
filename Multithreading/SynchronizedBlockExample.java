package Multithreading;

public class SynchronizedBlockExample {

    private int counter = 0;

    public void increment() {
        // Synchronized block to ensure thread-safe increment
        synchronized (this) {
            counter++;
            System.out.println(Thread.currentThread().getName() + " incremented counter to: " + counter);
        }
    }

    public static void main(String[] args) {
        SynchronizedBlockExample example = new SynchronizedBlockExample();

        // Create multiple threads that will call the increment method
        Thread thread1 = new Thread(() -> example.increment(), "Thread-1");
        Thread thread2 = new Thread(() -> example.increment(), "Thread-2");
        Thread thread3 = new Thread(() -> example.increment(), "Thread-3");

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
    }

}
