package Array;

import java.util.ArrayList;
import java.util.TreeSet;

public class FindSecondLargest {

    public static void main(String[] args) {

        int[] nums = { 3, 6, 4, 2, 8, 9, 1 };

        TreeSet<Integer> sortedSet = new TreeSet<>();

        for (int num : nums) {
            sortedSet.add(num);
        }

        Integer secondLargest = null;

        if (sortedSet.size() >= 2) {
            secondLargest = sortedSet.lower(sortedSet.last());
        }

        System.out.println(secondLargest);

    }

}
