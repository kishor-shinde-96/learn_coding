package String;
public class PalindromeChecker {

    public static void main(String[] args) {
        String input = "madam";

        boolean isPalindrome = isPalindrome(input);
        System.out.println(isPalindrome);
    }

    public static boolean isPalindrome(String input) {

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
