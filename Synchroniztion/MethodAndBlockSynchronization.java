package Synchroniztion;

class ATM {
    // Synchronized method: Only one customer can use ATM at a time
    public synchronized void useATM(String name) {
        System.out.println(name + " ATM use karna start kiya...");
        try {
            Thread.sleep(1000); // Time lag raha hai transaction me
        } catch (Exception e) {
        }
        System.out.println(name + " ATM use karna khatam kiya.");
    }

    // Synchronized block: Lock sirf transaction ke part pe lagaya
    public void checkBalance(String name) {
        System.out.println(name + " balance dekh raha hai (non-critical)...");

        synchronized (this) {
            System.out.println(name + " balance check kar raha hai (inside sync)...");
            try {
                Thread.sleep(1000); // Balance check ho raha hai
            } catch (Exception e) {
            }
            System.out.println(name + " ne balance check complete kiya.");
        }
    }
}

public class MethodAndBlockSynchronization {
    public static void main(String[] args) {
        ATM atm = new ATM();

        Thread customer1 = new Thread(() -> atm.useATM("Ramesh"));

        Thread customer2 = new Thread(() -> atm.checkBalance("Suresh"));

        customer1.start();
        customer2.start();
    }
}

