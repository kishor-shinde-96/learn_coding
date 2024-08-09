package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveAllZeroAtMiddle {

    public static void main(String[] args) {

        Integer[] nums = { 1, 0, 6, 8, 0, 5, 0 };

        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(nums));

        ArrayList<Integer> resultList = new ArrayList<>();

        ArrayList<Integer> zeroList = new ArrayList<>();

        for (Integer num : numList) {
            if (num != 0) {
                resultList.add(num);
            } else {
                zeroList.add(num);
            }
        }

        int middleLength = resultList.size() / 2;

        resultList.addAll(middleLength, zeroList);

        System.out.println(resultList);

    }

}
