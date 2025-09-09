public class PrimeNumber {
    public static void main(String[] args) {
        int n = 3;
        boolean isPrime = true; // Assume number is prime

        if (n <= 1) {
            isPrime = false; // 1 and below are not prime
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) { // Loop from 2 to sqrt(n)
                if (n % i == 0) {
                    isPrime = false; // If divisible, it's not prime
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is not prime");
        }
    }
}
