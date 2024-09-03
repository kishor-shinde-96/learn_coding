package Array;

import java.util.Set;
import java.util.TreeSet;

public class FindMaxNumber {

    public static void main(String[] args) {
        Integer[] nums = { 2, 6, 7, 5, 3, 9 };

        TreeSet<Integer> list = new TreeSet<>();

        for (Integer num : nums) {

            list.add(num);

        }
        System.out.println(list);

        System.out.println(list.first());

        System.out.println(list.last());
        System.out.println(list.lower(list.last()));
    }

}
