import java.util.Scanner;
public class CountEvenOddDigit {
    public static void main(String[] args) {
        System.out.println("Enter any number:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int evenCount = 0;
        int oddCount = 0;
        int numberofzero = 0;
        if(n == 0){
            System.err.println("Neither even Nor Odd");
        }else{
        while(n>0){
            int digit = n % 10;
            n = n/10;
            if(digit%2 == 0){
                if(digit == 0){
                    numberofzero++;
                }
                else{
                evenCount++;
                }
            }else{
                oddCount++;
            }
        }
        System.out.println("Even digits in the entered number is"+evenCount);
        System.out.println("Odd digits in the entered number is"+oddCount);
        System.out.println("The number of zeroes are"+numberofzero++);
        scanner.close();
    }}
}
