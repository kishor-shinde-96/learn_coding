package Array.StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArray {
    public static void main(String[] args) {
        Integer[] nums = { 1, 4, 3, 2, 5, 6 };

        List<Integer> list = Arrays.stream(nums)
        .sorted(Comparator.reverseOrder())
        .collect(Collectors.toList());

        System.out.println(list);

    }
}
