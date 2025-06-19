package String;
// SortStringByDecending

import java.util.Arrays;

public class SortStringByDecending {
    public static void main(String[] args) {

        String name = "kishor, shinde, karmala, umrad";

        String[] words = name.split(", ");

        Arrays.sort(words, (s1, s2) -> {

            if (s1.length() > 1 && s2.length() > 1) {

                return Character.compare(s2.charAt(1), s1.charAt(1));
            }
            return 0;

        });

        String sortedName = String.join(", ", words);

        System.out.println(sortedName);

    }

}
