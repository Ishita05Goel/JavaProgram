import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = scanner.next();
        int decimal = Integer.parseInt(binary, 2);//2 indicate base(2 is the base of any binary number)
        System.out.println("Decimal equivalent: " + decimal);
        scanner.close();
    }
}