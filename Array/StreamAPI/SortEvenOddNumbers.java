package Array.StreamAPI;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortEvenOddNumbers {
    public static void main(String[] args) {

        int n = 30;

        List<Integer> evenNumber = IntStream.range(1, n)
                .filter(i -> i % 2 == 0)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(evenNumber);
    }

}
