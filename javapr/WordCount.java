import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("hi how are you");
        while(scanner.hasNext()){
            System.out.println(scanner.next());
            scanner.close();
        } 
    }
}