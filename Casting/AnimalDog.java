package Casting;



class Animal {
    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

// Child class
class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }

    void wagTail() {
        System.out.println("Dog wags tail");
    }
}


public class AnimalDog {

    public static void main(String[] args) {

        // 🔼 UPCASTING: Dog → Animal
        Animal a = new Dog();  // This is allowed
        a.makeSound();         // Output: Dog barks ✅ (method overriding)

        // a.wagTail();        // ❌ Not allowed - Animal reference doesn't know wagTail()

        // 🔽 DOWNCASTING: Animal → Dog
        Dog d = (Dog) a;       // Allowed because actual object is Dog
        d.wagTail();           // Output: Dog wags tail ✅

        // ❌ UNSAFE DOWNCASTING Example:
        Animal b = new Animal();  // Only Animal object
        // Dog wrongDog = (Dog) b; // ❌ Runtime Error: ClassCastException
        
    }

}
