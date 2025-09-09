public class PrimeDemo {
    public static void main(String[] args) {
        int num = 17;
        int factorCount = 0;
        for(int i = 1;i<=num;i++){
            if(num%i == 0){
                factorCount++;
            }
        }
        if(factorCount == 2){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not prime");
        }
    }
}
