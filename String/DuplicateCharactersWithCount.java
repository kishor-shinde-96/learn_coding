package String;
// DuplicateCharactersWithCount

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersWithCount {

    public static void main(String[] args) {

        String name = "kishor shinde";

        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char ch : name.toCharArray()) {
            if (ch != ' ') {
                charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {

           // if (entry.getValue() > 1) {
               // System.out.println(entry.getKey() + ":" + entry.getValue());

                StringBuilder result = new StringBuilder();

                System.out.print(result.append(entry.getKey()).append(entry.getValue()).toString());
//}
        }
    }
}