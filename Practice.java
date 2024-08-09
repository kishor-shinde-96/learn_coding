
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Practice {

    public static void main(String[] args) {

        String input = "austere private limited";

        Set<Character> ch = new LinkedHashSet<>();

        for (char c : input.toCharArray()) {

            ch.add(c);

        }
        System.out.println(ch);

    }

}
