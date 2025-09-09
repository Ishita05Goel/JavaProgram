public class PositionSwap {
    public static void main(String[] args) {
        int number = 32145;
        int position = 0;
        int sum = 0;
        while(number!=0){
        int digit = number %10;
        position++;
        int val = position * (int)Math.pow(10,digit-1);
        sum = sum + val;
        number = number/10;
        }
        System.out.println(sum);
    }
}
