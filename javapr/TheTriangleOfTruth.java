public class TheTriangleOfTruth {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        if(a+b>c && a+c >b && c+b >a ){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
