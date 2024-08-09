package String;
import java.util.HashSet;
import java.util.Set;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {

        String input = "swiss";

        Set<Character> seen = new HashSet<>();
        Set<Character> dupSet = new HashSet<>();

        for (char ch : input.toCharArray()) {

            if (ch != ' ') {

                if (!seen.add(ch)) {
                    dupSet.add(ch);
                }
            }
        }
        System.out.println(dupSet);
    }

}
