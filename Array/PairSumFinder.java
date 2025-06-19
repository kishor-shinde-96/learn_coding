package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PairSumFinder {

    public static void main(String[] args) {
        Integer[] array = { 2, 4, 10, 8, 5, 9, 7, 20, 25 };
        int target = 15;

        List<String> pairList = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (Integer n : array) {
            int complement = target - n;

            if (seen.contains(complement)) {

                pairList.add("(" + complement + ", " + n + ")");
            }

            seen.add(n);
        }

        System.out.println("Pairs that sum to " + target + ": " + pairList);
    }
}
