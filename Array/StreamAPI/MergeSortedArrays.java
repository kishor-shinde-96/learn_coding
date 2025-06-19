package Array.StreamAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = { 1, 3, 5 };
        int[] nums2 = { 2, 4, 6 };

        TreeSet<Integer> sortedSet = Stream.concat(Arrays.stream(nums1).boxed(), Arrays.stream(nums2).boxed())
        .collect(Collectors.toCollection(TreeSet::new));

        System.out.println(sortedSet);

    }
}
