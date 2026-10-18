public class type_conversion{
    public static void main(String[] a){
    //widening conversion

       // Common widening path:
            // byte -> short -> int -> long -> float -> double

            // char -> int -> long -> float -> double

        //eg 1: byte to int conversion
        byte age = 20;
        int age1 = age;
        System.out.println("Age in byte is: " + age);
        System.out.println("Age in int is: " + age1);

        //eg 2:int to long conversion
        int salary = 10000000;
        long salary1 = salary;
        System.out.println("Salary in int is: " + salary);
        System.out.println("Salary in long is: " + salary1);
        
        //eg 3: long to float conversion
        // -> float can hold larger values than long, but it has less precision. So, when converting a long to a float, there may be a loss of precision if the long value is too large to be represented accurately as a float.
        long distance = 1_00_08_00_000L;
        float distance1 = distance;
        System.out.println("Distance in long is: " + distance);
        System.out.println("Distance in float is: " + distance1);

        //eg 4: float to double conversion
        // -> double can hold larger values than float, and it has more precision. So, when converting a float to a double, there is no loss of precision.
        float price = 99.99f;
        double price1 = price;
        System.out.println("Price in float is: " + price);
        System.out.println("Price in double is: " + price1);


    //only char to int,long,float,double conversion
        //char grade = 'A';
        char grade = '0'; // This is a character literal '0'
        int grade1 = grade;
        System.out.println("Grade in char is: " + grade);
        System.out.println("Grade in int is: " + grade1);
   
    //boolean is not compatible with any other data type for both widening and narrowing conversions.
        
    

    //Narrowing conversion
        //double>float>long>int>short>byte

        //eg 1: double to float conversion
        double pi = 3.1424246543;
        float pi1 = (float) pi; // float only have 7 digits of precision
        System.out.println("Pi in double is: " + pi);
        System.out.println("Pi in float is: " + pi1);

        //eg 2: long to int,short,byte conversion
        long population = 7800000000L;
        int population1 = (int) population; // int can only hold limited values ,if it exceeds the limit, it will cause overflow and the value will wrap around to the negative side of the range. 
        System.out.println("Population in long is: " + population);
        System.out.println("Population in int is: " + population1);

        //eg 3: char to double,float,long,int,short,byte conversion
        char letter = 'A';
        float letter1 = (float) letter; // char can be converted to int, but it will give the ASCII value of the character.
        System.out.println("Letter in char is: " + letter);
        System.out.println("Letter in int is: " + letter1);

        //eg 4: int to char conversion
        int number = 6555;
        char number1 = (char) number; // int can be converted to char, but it will give the character corresponding to the ASCII value of the integer.
        System.out.println("Number in int is: " + number);
        System.out.println("Number in char is: " + number1);
        
        byte ab = 10;
        byte b = 20;

        // byte c = a + b; // Compilation error
        int c = ab + b;
        // arthimetic operations on byte, short, or char types are promoted to int type in Java.
        System.out.println(c); // 30
    }
}
