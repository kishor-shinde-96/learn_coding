package Singleton;

// Double-Checked Locking (Efficient)
class Singleton2 {

    private static volatile Singleton2 instance;

    private Singleton2() {

    }

    public static Singleton2 getInstance() {
        if (instance == null) { // first check (no lock)

            synchronized (Singleton2.class) {
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }

}

public class DoubleCheckedLocking {
    public static void main(String[] args) {
        Singleton2 s1 = Singleton2.getInstance();
        Singleton2 s2 = Singleton2.getInstance();

        System.out.println(s1 == s2);
    }

}
