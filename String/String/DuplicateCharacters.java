package String;

//DuplicateCharacters
import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String name = "Kishor shinde";
        Set<Character> seen = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();

        for (char c : name.toCharArray()) {
            if (c != ' ') {
                if (!seen.add(c)) {
                    duplicates.add(c);
                }
            }
        }
        System.out.println(duplicates);
    }
}
