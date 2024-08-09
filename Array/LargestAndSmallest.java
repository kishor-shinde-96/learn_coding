package Array;

public class LargestAndSmallest {
    public static void main(String[] args) {
        int[] nums = {3, 5, 1, 8, 9, 2, 7};
        
        // Initialize variables to store the smallest and largest numbers
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        // Iterate through the array to find the smallest and largest numbers
        for (int num : nums) {
            if (num < min) {
                min = num; // Update min if current num is smaller
            }
            if (num > max) {
                max = num; // Update max if current num is larger
            }
        }
        
        // Output the smallest and largest numbers found
        System.out.println("Smallest: " + min + ", Largest: " + max); // Output: Smallest: 1, Largest: 9
    }
}

