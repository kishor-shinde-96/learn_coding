package Array;

public class MissingNumber {

    public static void main(String[] args) {

        int[] nums = { 1, 2, 4, 5, 6 };
        int n = nums.length + 1;

        int totalSum = n * (n + 1) / 2;

        int currentSum = 0;

        for (int num : nums) {

            currentSum += num;
        }

        int missingNumber = totalSum - currentSum;

        System.out.println(missingNumber);

    }

}
