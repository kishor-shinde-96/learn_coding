package Singleton;

class Singleton3 {
    // INSTANCE;

    public void show() {
        System.out.println("Hello from Enum Singleton");
    }
}

public class EnumSingleton {
    public static void main(String[] args) {
        Singleton3 s1 = Singleton3.INSTANCE;
        Singleton3 s2 = Singleton3.INSTANCE;

        System.out.println(s1 == s2); // true
        s1.show();
    }
}
