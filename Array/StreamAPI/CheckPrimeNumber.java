package Array.StreamAPI;

import java.util.stream.IntStream;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        
        int num = 23 ;

        Boolean isPrime = num > 1 &&
        IntStream.range(2,num)
        .noneMatch(i -> num % i ==0);


        System.out.println(isPrime);
    }
}
