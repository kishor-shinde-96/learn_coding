package Array.StreamAPI;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class MoveAllZeroAtEnd {
    public static void main(String[] args) {
        int[] nums = { 1, 0, 6, 8, 0, 5, 0 };


        List<Integer> nonZero = Arrays.stream(nums)
            .filter(i -> i != 0)
            .boxed()
            .collect(Collectors.toList());

        List<Integer> Zero = Arrays.stream(nums)
            .filter(i -> i == 0)
            .boxed()
            .collect(Collectors.toList());   
            
            nonZero.addAll(3,Zero);
           // Zero.addAll(nonZero);

            System.out.println(nonZero);

        
    }
}
