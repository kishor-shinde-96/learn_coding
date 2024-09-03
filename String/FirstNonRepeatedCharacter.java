package String;
import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {

        String input = "swiss";

        Map<Character, Integer> charCount = new HashMap<>();

        // Count occurrences of each character
        for (char ch : input.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // Find the first non-repeated character
        for (char ch : input.toCharArray()) {
            if (charCount.get(ch) == 1) {
                System.out.println("First non-repeated character is: " + ch);
                return;
            }
        }

        System.out.println("No non-repeated character found.");
    }
}

