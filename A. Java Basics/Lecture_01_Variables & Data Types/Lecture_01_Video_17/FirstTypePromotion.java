

//Here's an example of first type promotion in Java:

// Type promotion is the automatic conversion of a lower data type to a higher data type.
public class FirstTypePromotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';

        //possible lossy conversion from int to char, cannot convert from int to char
        //char c = a - b; 

        //println a and b and their ASCII values

        System.out.println((int)(a)); 
        System.out.println((int)(b));

        //perform arithmetic operations on a and b

        System.out.println(a+b);
        System.out.println(b-a);
        System.out.println(a*b);
        System.out.println(b/a);
        System.out.println(b%a);
        System.out.println(a);
        System.out.println(b);
        System.out.println(a+10);
        System.out.println(a+10.5);
        System.out.println((int)(a+10.5)); //Type promotion for double to int conversion.
        System.out.println(a+"b");
        System.out.println(a+10+"b");
    }
}
