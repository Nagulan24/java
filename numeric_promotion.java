import java.math.BigDecimal;
import java.math.RoundingMode;
public class numeric_promotion {
    public static void main (String[] args){

        // Numeric promotion is a process in Java where smaller data types are automatically converted to larger data types during arithmetic operations to prevent loss of information. 
        // This is done to ensure that the result of an operation can be represented accurately without losing precision.

        //eg 1: byte, short and int
        byte a=10;
        byte b=20;
        // byte c = a + b; // Compilation error
        int c= a+b; // byte is promoted to int during the addition operation
        System.out.println("Sum of a and b is: " + c);

        // if you want store in byte variable then you have to do type casting
        byte d = (byte) (a + b); // Explicit type casting from int to byte
        System.out.println("Sum of a and b after type casting is: " + d);

        //eg 2: char and int
        char ch ='a';
        int num = 5;
        // char ch1 = ch + num; Compilation error
        int ch1= ch+num; // char is promoted to int during the addition operation
        System.out.println("Sum of ch and num is: " + ch1);
        System.out.println("Character corresponding to the sum is: " + (char)ch1); // Explicit type casting from int to char

        char ch2 = 'b';
        int ch3 = ch + ch2; // char is promoted to int during the addition operation
        System.out.println("Sum of ch and ch2 is: " + ch3);

        //eg 3: int to long conversion
        int anotherNum = 1000000000;
        long longNum = 10000100000L;
        long sum = anotherNum + longNum; // int is promoted to long during the addition operation
        System.out.println("Sum of anotherNum and longNum is: " + sum);

        // same as eg 3 for 1) long to float conversion to need float variable to store result 
        // 2) float to double conversion to need double variable to store result
        
        // important :

        int x = 10;
        int y = 3;
        double res =(double) x/y; // 3.333333333333335
        System.out.println("Sum of x and y is: " + res);
        double res2 = x/y; // 3.0
        System.out.println("Sum of x and y is: " + res2);

        //unary promotion : byte, short, or char types are promoted to int type when used in unary operations .
        byte u=5;
        //byte v=+u; // u is promoted to int during the unary operation
        int v=+u;
        System.out.println("Value of u after unary is: " + u);

        //Big decimal

        // use only requiring decimal accuracy , in normal usage use double or float

        BigDecimal val = new BigDecimal("0.1");
        BigDecimal val2 = new BigDecimal("0.3");

        BigDecimal result_add= val.add(val2);
        System.out.println(result_add);

        BigDecimal result_sub = val2.subtract(val);
        System.out.println(result_sub);

        BigDecimal result_multiply =val.multiply(val2);
        System.out.println(result_multiply);

        BigDecimal result_divide = val.divide(val2,2,RoundingMode.HALF_UP);//to avoid repeating decimals use this , that avoid Arthimetic expression
        System.out.println(result_divide);

        // bigdecimal is immutable

        val.add(val2);

        System.out.println(val);//0.1


    }
}
