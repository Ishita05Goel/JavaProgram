//package javapr;

public class Demo {
    //can we have more than one main in a single name - yes! we can
    //main overloading
    public static void main(){
        System.out.println("I am in the main");

    }

     static public void main(String ...args){ //positions of public and static are interchangeable and we can use ... instead of []
        System.out.println("Hello java");// print new line
        System.out.print("hello");//print in same line
    }
}
