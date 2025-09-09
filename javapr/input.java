import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //scanner is a reference variable object starts after new keyword.
        //scanner - Buffer
        //System.in - input because input is slow thats why  we use buffer
        System.out.println("Enter any first number");
        int n1 = scanner.nextInt();
        System.out.println("Enter any second number");
        int n2 = scanner.nextInt();//we can take second input after taking space after first input without using second scanner
        System.out.println("first no."+n1+" second number "+n2);
        scanner.close(); 
    }
}
