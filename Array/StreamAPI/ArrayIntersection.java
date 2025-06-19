package Array.StreamAPI;

import  java.util.*;
import java.util.stream.Collectors;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,2};
        int[] nums2 = {1,2,4};



        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());

        Set<Integer> intersection = Arrays.stream(nums2).boxed()
                             .filter(set1::contains)
                             .collect(Collectors.toSet());

        System.out.println(intersection);
    }
}
