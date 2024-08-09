package String;
public class ReverseString {

    public static void main(String[] args) {
        String input = "hello";
        String reString = new StringBuilder(input).reverse().toString();
        System.out.println(reString);
    }

}