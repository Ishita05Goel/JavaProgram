import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        //user input for tea,coffee,drink.
        //String result;
        //colon : vs arrow ->
        //java 14 
        System.out.println("What you want to order - \n 1.Tea\n2.Coffee\n3.Drink");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        String result = switch(ch){
            case 1 -> "Rs 50";
            case 2 -> "Rs 70";
            case 3 -> {
                //int c = 100;
                //int d = c*c;
                yield "Rs 150"; 
            }
            default -> "Wrong choice";
        };
        System.out.println(result);
        sc.close();
    }
}
