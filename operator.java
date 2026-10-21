public class operator {
    public static void main(String[] args) {
        
    //arithmetic operators

        int a =10;
        int b=5;
        System.out.println("Addition of a and b is: "+(a+b));
        System.out.println("Subtraction of a and b is: "+(a-b));
        System.out.println("Multiplication of a and b is: "+(a*b));
        System.out.println("Division of a and b is: "+(a/b));
        System.out.println("Modulus of a and b is: "+(a%b));
        System.out.println("--------------------------------");

    //unary operators
        byte x = 10;
        // byte x = -x; it will give error because x is already defined as byte and -x will be int
        System.out.println("Value of x is: "+x);
        System.out.println("Value of x after decrement is: "+-x);

        //prefix increment and decrement
        System.out.println("Value of x before increment is: "+x);
        System.out.println("Value of x after increment is: "+(++x));
        System.out.println("Value of x after decrement is: "+(--x));

        //postfix increment and decrement
        System.out.println("\nValue of x before increment is: "+x);
        System.out.println("Value of x after increment is: "+(x++));
        System.out.println("Value of x after decrement is: "+(x--));

        System.out.println("--------------------------------");
    
    //relational operators
        int p = 10;
        int q = 20;
        System.out.println("\nIs p equal to q "+(p==q));
        System.out.println("Is p not equal to q "+(p!=q));
        System.out.println("Is p greater than q "+(p>q));
        System.out.println("Is p less than q"+(p<q));
        System.out.println("Is p greater than or equal to q "+(p>=q));
        System.out.println("Is p less than or equal to q "+(p<=q));

        //for reference comparison we can use equals() method
        String str1 = "Hello";
        String str2 = new String("Hello");// it will create new object in heap memory
        System.out.println("\nIs str1 equal to str2 "+str1.equals(str2));// it check value
        System.out.println("Is str1 equal to str2 "+(str1==str2));// it check refernece
        System.out.println("Is str1 not equal to str2 "+!str1.equals(str2));
        System.out.println("Is str1 not equal to str2 "+(str1!=str2));

        System.out.println("--------------------------------");

    //logical operators

        // && and || are check first condition if it is false then it will not check second condition
        // & and | are check both condition even if first condition is false
        //recommended to use && and || for better performance


        boolean a1 = true;
        boolean b1 = false;
        int a2 = 10;
        int b2 = 20;
        System.out.println("\nLogical AND of a1 and b1 is: "+(a1 & b1));
        System.out.println("Logical OR of a1 and b1 is: "+(a1 | b1));
        System.out.println("Logical NOT of a1 is: "+(!a1));
        
    //short-circuit operators
        System.out.println("\nShort-circuit AND of a1 and b1 is: "+(false && (++a2>0)));
        System.out.println("Short-circuit OR of a1 and b1 is: "+(a1 || b1));
        System.out.println("Short-circuit NOT of a1 is: "+(!a1));

    //bitwise operators
        int c =5;
        int d =3;
        int e = c&d; //if both bits are 1 then it will return 1 else 0
        System.out.println("\nBitwise AND of c and d is: "+e);

        int f = c|d; //if any bit is 1 then it will return 1 else 0
        System.out.println("Bitwise OR of c and d is: "+f);

        int g = c^d; //if both bits are different then it will return 1 else 0
        System.out.println("Bitwise XOR of c and d is: "+g);

        int h = ~c; //it will return one's complement of c
        System.out.println("Bitwise NOT of c is: "+h);

    //shift operators
        int i = 5;
        int j = i<<1; //it will shift bits to left by 1 position and fill 0 in rightmost position
        System.out.println("\nLeft shift of i is: "+j);

        int k = i>>1; //it will shift bits to right by 1 position and fill 1 for negative number and 0 for positive number in leftmost position
        System.out.println("Right shift of i is: "+k);

        int l = i>>>1; //it will shift bits to right by 1 position and fill 0 in leftmost position
        System.out.println("Unsigned right shift of i is: "+l);

    //assignment and compound assignment operators
        int m = 10;
        m += 5; //m = m + 5
        System.out.println("\nValue of m after addition is: "+m);

        m -= 5; //m = m - 5
        System.out.println("Value of m after subtraction is: "+m);

        m *= 5; //m = m * 5
        System.out.println("Value of m after multiplication is: "+m);

        m /= 5; //m = m / 5
        System.out.println("Value of m after division is: "+m);

        m %= 5; //m = m % 5
        System.out.println("Value of m after modulus is: "+m);

        m &= 5; //m = m & 5
        System.out.println("Value of m after bitwise AND is: "+m);

        m |= 3; //m = m | 3
        System.out.println("Value of m after bitwise OR is: "+m);

        m ^= 6; //m = m ^ 6
        System.out.println("Value of m after bitwise XOR is: "+m);

        m <<= 1; //m = m << 1
        System.out.println("Value of m after left shift is: "+m);

        m >>= 1; //m = m >> 1
        System.out.println("Value of m after right shift is: "+m);

        m >>>= 1; //m = m >>> 1
        System.out.println("Value of m after unsigned right shift is: "+m);

    // ternary operator
        int age =10;
        String w = age>=18 ? "adult":"child";
        System.out.println("\nAge is: "+age);
        System.out.println("You are an "+w);
    }
}
