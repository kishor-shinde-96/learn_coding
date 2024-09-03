package Array;

import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {

    public static void main(String[] args) {

        int[] nums1 = {1,2,3,2};
        int[] nums2 = {1,2,4};

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (Integer num : nums1) {

            set1.add(num);
        }

        for (Integer num : nums2) {

            if (set1.contains(num)) {

                set2.add(num);
            }

        }
        System.out.println(set2);

    }

}
