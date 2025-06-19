package Multithreading;

// Implementing the Runnable Interface
public class MultithreadingDemo2 implements Runnable {

    @Override
    public void run() {
        try {
            // Displaying the thread that is running
            System.out.println(
                    "Thread " + Thread.currentThread().getId()
                            + " is running");
        } catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }

    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i < n; i++) {
            MultithreadingDemo multithreadingDemo = new MultithreadingDemo();
            multithreadingDemo.start();
        }
    }
}
