package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEvenOddNumbers {
    public static void main(String[] args) {
        int n = 30;

        List<Integer> evenNumber = new ArrayList<>();
        List<Integer> oddNumber = new ArrayList<>();

        for (int i = 1; i < n; i++) {

            if (i % 2 == 0) {
                evenNumber.add(i);
            } else {
                oddNumber.add(i);
            }
        }

        Collections.sort(evenNumber);
        Collections.sort(oddNumber);

        System.out.println("even :"+ evenNumber.toString());
        System.out.println(oddNumber);

    }

}
