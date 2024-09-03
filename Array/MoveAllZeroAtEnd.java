package Array;
import java.util.ArrayList;
import java.util.List;

public class MoveAllZeroAtEnd {
    public static void main(String[] args) {

        int[] nums = { 1, 0, 6, 8, 0, 5, 0 };

        List<Integer> resutList = new ArrayList<>();
        List<Integer> zeroList = new ArrayList<>();

        for (int num : nums) {
            if (num != 0) {
                resutList.add(num);
            }else{
                zeroList.add(num);
            }
        }

         resutList.addAll(zeroList);

        System.out.println(resutList);

    }
}
