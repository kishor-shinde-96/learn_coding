package String;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Number of terms in the Fibonacci sequence to display
        int first = 0, second = 1;

        System.out.print(first + " " + second + " ");

        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}
