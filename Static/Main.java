package Static;

class Parent {
    static void show() {
        System.out.println("Parent's static show()");
    }
}

class Child extends Parent {
    static void show() {
        System.out.println("Child's static show()");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.show(); // Parent's static show()

        Child c = new Child();
        c.show(); // Child's static show()

        Parent ref = new Child();
        ref.show(); // Parent's static show() -> NOT Child's
    }
}

