public class Datatype {
    public static void main (String args[]) {


        // byte = 1 byte and 1 byte = 8-bits 
        byte b1 = -128;
        byte b2 = 127;
        System.out.println(b1);
        System.out.println(b2);


        // char = 2 bytes 
        char ch = 'a';
        System.out.println(ch);


        // boolean = 1 byte(True/false)
        boolean var = false;
        System.out.println(var);


        // int = 4 bytes
        int number1 = -2147483648;
        int number2 = 2147483647;
        System.out.println(number1);
        System.out.println(number2);


        // float = 4 bytes
        float price = 10.5f;
        System.out.println(price);


        // double = 8 bytes
        double sell = 105445.550D;
        System.out.println(sell);


        // short = 2 bytes
        short min = -32767;
        short max = +32767;
        System.out.println(min);
        System.out.println(max);


        // long = 8 bytes
        long num1 = -9223372036854775808l;
        long num2 = 9223372036854775807l;
        System.out.println(num1);
        System.out.println(num2);
    }
    
}
