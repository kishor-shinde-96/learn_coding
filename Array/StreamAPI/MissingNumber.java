package Array.StreamAPI;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MissingNumber {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 5, 6, 7, 8, 9 };

        int n = nums.length + 1;

        int totalSum = IntStream.rangeClosed(1, n).sum();
        int currentSum = Arrays.stream(nums).sum();

        int missingNumber = totalSum - currentSum;
        System.out.println("Missing number: " + missingNumber);

    }
}
