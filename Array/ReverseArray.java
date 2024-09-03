package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArray {

    public static void main(String[] args) {

        Integer[] nums = { 1, 4, 3, 2, 5, 6 };

        List<Integer> list = new ArrayList<>();

        for (Integer integer : nums) {
            list.add(integer);
        }

        // for (int i = list.size() - 1; i >= 0; i--) {

        //     System.out.println(list.get(i));

        // }

        Collections.sort(list); // assending
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());  //  desending
        System.out.println(list);
    }

}
