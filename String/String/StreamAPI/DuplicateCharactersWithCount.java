package String.StreamAPI;

import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors; 

public class DuplicateCharactersWithCount {
    
    public static void main(String[] args) {
        String name = "kishor shinde";

      Optional<Character> cart =  name.chars()
        .mapToObj(c -> (char) c)
        .filter(c -> c != ' ')
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        .entrySet()
        .stream()
        .filter(e -> e.getValue() == 1)
        .map(e -> e.getKey())
        .findFirst();


        cart.ifPresent(c -> System.out.println("First unique character: " + c));
    }
}
