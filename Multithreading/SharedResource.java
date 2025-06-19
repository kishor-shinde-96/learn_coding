package Multithreading;

public class SharedResource {
    private StringBuffer buffer = new StringBuffer();

    // Method to add a message to the buffer with synchronization
    public synchronized void addMessage(String message) {
        buffer.append(message);
        buffer.append(" ");

        // Notify other threads that the buffer has been updated
        notifyAll();
    }

    // Method to print the buffer's content with synchronization
    public synchronized void printMessages() {
        while (buffer.length() == 0) {
            try {
                // Wait until there is something in the buffer
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(buffer.toString());

        // Clear the buffer after printing
        buffer.setLength(0);
    }

    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        // Thread to add messages
        Thread producer = new Thread(() -> {
            resource.addMessage("Hello");
            resource.addMessage("World");
        });

        // Thread to print messages
        Thread consumer = new Thread(() -> {
            resource.printMessages();
        });

        producer.start();
        consumer.start();
    }
}
