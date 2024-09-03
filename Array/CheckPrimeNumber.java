package Array;

public class CheckPrimeNumber {

    public static void main(String[] args) {
        int num = 29;

        boolean isPrime = true;

        if (num < 2) {

            isPrime = false;

        } else {
            // for (int i = 2; i < Math.sqrt(num); i++) {

                if (num % 2 == 0) {
                    isPrime = false;
                 //   break;
                }

        //    }

        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

    }

}
