public class SumOfDigit {
    public static void main(String[] args) {
        int num = 123;
        int sum = 0;
        while(num != 0){
        //get the digit from the number
        int LastDigit = num%10;

        //getting the sum
        sum = sum + LastDigit;
        
        //make the digit small
        num = num/10;
        
        }
        System.out.println(sum);
    }
}
