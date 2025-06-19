package Array.StreamAPI;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class FindMaxMINNumber {
    public static void main(String[] args) {
        Integer[] array1 = {1,3,2,5,6,8,9};

        TreeSet<Integer> list = Arrays.stream(array1)
        .collect(Collectors.toCollection(TreeSet::new));

        System.out.println("Sorted TreeSet: " + list);
        System.out.println("First Element: " + list.first() );
        System.out.println("Last Element: " + list.last());
        System.out.println("Lower than Last: " + list.lower(list.last()) );

    }
}
