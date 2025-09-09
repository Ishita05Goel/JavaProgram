public class Number {
    public static void main(String[] args) {
        int num = 1234;
        int count = 0;
        int copy = num;
        while(num!=0){
            num = num/10;
            count++;
        }
        num = copy;
        int pow = (int) Math.pow(10,count-1);
        while(num!=0){
            System.out.println(num/pow);
            num = num%pow;//make number small
            pow = pow/10;
        }
    }
}
//count function
//1234%10000
//1234/10000