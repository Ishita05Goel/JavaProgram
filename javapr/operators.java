public class operators {
    public static void main(String ...args){
        byte a = 10;
        byte b = 20;
        b +=a; // b = b+a
        byte c = (byte)(a+b);
        //find the greater in three numbers with only nested loop
        a = 10;
        b = 50;
        c = 30;
        if(a>b){
            if(a>c){
                System.out.println("a is greater");
            }
            else{
                System.out.println("C is greater");
            }
        }
        else{
            if(b>c){
                System.out.println("b is greater");
            }
            else{
                System.out.println("C is greater");
            }
        }

}
}
