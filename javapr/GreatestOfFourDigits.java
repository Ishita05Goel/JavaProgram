public class GreatestOfFourDigits {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        int c = 212;
        int d = 101;
        //we have to use nested if and else
        if(a>b){
            if(a>c){
                if(a>d){
                    System.out.println("a is greatest");
                }
                else{
                    System.out.println("d is greatest");
                }
            }
            else{
                if(c>d){
                    System.out.println("c is greatest");
                }
                else{
                    System.out.println("D is greatest");
                }
            }
        }
        else{
            if(b>c){
                if(b>d){
                    System.out.println("B is greatest");
                }
                else{
                    System.out.println("d is greatest");
                }
            }
            else{
                if(c>d){
                    System.out.println("C is greatest");
                }
                else{
                    System.out.println("d is greatest");
                }
            }
        }

    }
}
