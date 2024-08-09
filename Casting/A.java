package Casting;

class A {
    public void m1() {
        System.out.println("m1");
    }
    
    @Override
    public String toString() {
        return "This is an instance of class A";
    }
}

class B extends A {
    public void m2() {
        System.out.println("m2");
    }
    
    @Override
    public String toString() {
        return "This is an instance of class B";
    }

    public static void main(String[] args) {
        A b = new B(); // Upcasting
       B newb =(B) b;
       System.out.println(newb);
    }
}
