package String.StreamAPI;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateChar {
    public static void main(String[] args) {
        
        String name = "Kishor shinde";

        Set<Character> view = new HashSet<>();
        Set<Character> duplicate = name.chars()
        .mapToObj(c -> (char) c)
        .filter(c -> c!= ' ')
        .filter(c -> !view.add(c))
        .collect(Collectors.toSet());


        System.out.println(duplicate);
    }
}
