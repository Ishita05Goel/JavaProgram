/*public class demo3 {

    stringBuffer sb1 = new StringBuffer();
    stringBuilder sb2 = new StringBuilder();
}*/
import java.math.BigInteger;
import java.math.BigDecimal;

public class demo3 {
    // strictfp ensures floating-point calculations follow IEEE 754 standard.
    public static strictfp void main(String... args) {
        String name = "ishita";
        long timeInMs = 4545632L; // Long literal
        int x = 10; // Explicit declaration
        var y = 20; // Implicit declaration using 'var'
        byte r = 127;
        float p = 2.34f; // 'f' suffix to indicate float
        byte i = (byte) 130; // Overflow: 130 → -126

        System.out.println("Byte r: " + r);
        System.out.println("Casted byte i: " + i);

        BigInteger b1 = new BigInteger("4343434343444444444444444443333333333333333333333333334444444444444444");
        BigInteger b2 = new BigInteger("4343434343444444444444444443333333333333333333333333334444444444444444");
        BigInteger b3 = b1.add(b2);
        System.out.println("BigInteger sum: " + b3);

        BigDecimal b4 = new BigDecimal("4545836428920373.58");
        System.out.println("BigDecimal value: " + b4);

        Integer f2 = 100; // Wrapper class
        System.out.println("Integer byte value: " + f2.byteValue());
    }
}
