package Array.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueAndDuplicateNumbers {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 2, 4, 5, 3, 6, 7, 8, 8, 9};

        List<Integer> list = Arrays.stream(numbers)
                .boxed()
                .toList();

        System.out.println("Original List: " + list);
                 list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey()+  ":  "  +entry.getKey()));
    }
}
