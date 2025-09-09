import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();
        int sum = (n * (n + 1)) / 2;
        System.out.println("Sum of first " + n + " natural numbers: " + sum);
        scanner.close();
    }
}
