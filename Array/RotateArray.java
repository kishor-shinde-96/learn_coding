package Array;

import java.util.*;

public class RotateArray {

    public static void main(String[] args) {

        Integer[] nums = { 1, 2, 3, 4, 5, 6, 7 };

        int k = 3;

        List<Integer> numList = Arrays.asList(nums);

        Collections.rotate(numList, k);

        numList.toArray(nums);
        
        System.out.println(Arrays.toString(nums));

    }

}