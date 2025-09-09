import java.math.BigInteger;
import java.math.BigDecimal;

public class Demo2 {
    //strictfp - IEEE -  754 floating point standard. strictfp can also be add before class. string is a class not a keyword.
    //objects are formed in heap memory
    //In Java, the strictfp is a modifier that stands for strict floating-point which was not introduced in the base version of 
    //Java as it was introduced in Java version 1.2. 
    //It is used in Java for restricting floating-point calculations and ensuring the same result on every platform while performing 
    //operations in the floating-point variable.
    public static strictfp void main(String ...args){
        //var z;
        //string - collection of chars, char[]-wrapper
        String name = "ishita";
        long TimeInMs = 4545632L; //long literal
        int z;
        int x = 10;// Explicit way of declaration variable
        // type inference : based on its value it decide type
        var y = 20; // implicit way of declaration variable - modern syntax
        byte r = 127;
        float p = 2.34f;
        //if we will not add f it will become double value
        byte i = (byte)130; //type cast(130-127:(3:-126))no garbage value
        System.out.println(r);
        System.out.println(i);
        BigInteger b1 = new BigInteger("4343434343444444444444444443333333333333333333333333334444444444444444");
        BigInteger b2 = new BigInteger("4343434343444444444444444443333333333333333333333333334444444444444444");
        BigInteger b3 = b1.add(b2);
        System.out.println(b3);
        BigDecimal b4 = new BigDecimal("4545836428920373.58");
        //arithmetic operation cannot be apply on big integers directly
        Integer f2 = 100;//wrapper method 8 - wrapper methods . wrappers work on objects
        System.out.println(f2.byteValue());
        //java inbuilt datastructure uses objects and are predefined in java like linked list arraylist etc.
        //
        //string literal objects formed is 1 or 0 
    }

}
/*
 * non decimal:
 * Byte,short,int,long. 
 * decimal value:
 * float,double.
 * char-2byte-UNIcode
 * reference type: address based type
 * BigInteger: range more than long. and it is  a class
 */