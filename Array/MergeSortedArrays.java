package Array;
import java.util.TreeSet;

public class MergeSortedArrays {

    public static void main(String[] args) {

        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 4, 6};

        TreeSet<Integer> sortedSet = new TreeSet<>();
        for (int num : nums1) {
            sortedSet.add(num);
        }
        
        for (int num : nums2) {
            sortedSet.add(num);
        }

        System.out.println(sortedSet);

    }
    
}
