package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapElements {

    public static void main(String[] args) {
        Integer[] nums = { 1, 2, 3, 4, 5 };
        List<Integer> list = new ArrayList<>();
        int index1 = 1;
        int index2 = 3;

        Collections.addAll(list, nums);

        Collections.swap(list, index1, index2);

        System.out.println(list);

    }

}
