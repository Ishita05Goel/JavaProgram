import java.util.Scanner;
public class CountNumberOfZero {
    public static void main(String[] args) {
        System.out.println("Enter any number containing number of zeroes");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ZeroCount = 0;
        if(n == 0){
            ZeroCount++;
        }
        else{
            while(n>0){
            int last = n % 10;
            n = n/10;
            if(last == 0){
                ZeroCount++;
            }
        }}
        System.out.println(ZeroCount);
        scanner.close();
    }
}
