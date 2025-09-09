import java.util.Scanner;
public class CountEvenOdd{
    public static void main(String[] args) {
        int even_count = 0;
        int odd_count = 0;
        System.out.print("Enter any number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1;i<=n;i++){
            if(i%2 == 0){
                even_count++;
            }
            else{
                odd_count++;
            }
        }
        System.out.println("The number of even numbers between 1 to n : "+even_count);
        System.out.println("The number of odd numbers between 1 to n : "+odd_count);
        scanner.close();

    }
    
}
