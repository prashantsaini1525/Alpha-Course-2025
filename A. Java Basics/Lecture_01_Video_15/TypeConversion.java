import java.util.*;


public class TypeConversion {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        
        /* TYPE CONVERSION POSSIBLE ONLY : BYTE -> SHORT -> INT -> FLOAT -> LONG -> DOUBLE */
        int a = 25;
        long b = a;
        System.out.println("Type Conversion : " + b);


        float var = sc.nextInt();
        System.out.println(var);

        /*in below you can see this we cannot store long data type into a int variable because long variable a big data type more than 
        int data type. long data type have 8 bytes whereas int data type has 4 bytes to store the data. */


        /*long a = 10;
        int b = a;
        System.out.println("Lossy Conversion : " + b);*/


        /*int number = sc.nextFloat();
        System.out.println(number); */
    }
}
