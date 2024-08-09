package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveAllZeroAtEnd {
    public static void main(String[] args) {

        Integer[] nums = { 1, 0, 6, 8, 0, 5, 0 };

        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(nums));

        ArrayList<Integer> resuList = new ArrayList<>();

        for (Integer num : numList) {
            if (num != 0) {
                resuList.add(num);
            }
        }

        while (resuList.size() < numList.size()) {
            resuList.add(0);
        }

        System.out.println(resuList);

    }
}
