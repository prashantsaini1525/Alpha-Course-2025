import java.util.*;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*A float value cannot be directly assigned to an int because it is a lossy conversion, 
        meaning that some data (the decimal part) will be lost in the process.
        Java doesn't allow this type of conversion automatically because it wants to ensure that you are aware of the potential data loss.
        and this is also called narrowing converison*/
        /* TYPE CONVERSION POSSIBLE ONLY : BYTE -> SHORT -> INT -> FLOAT -> LONG -> DOUBLE */
        float a = 25.9999f;
        /*int b = a;*/ //this is a lossy conversion
        int b = (int) a;
        System.out.println("Type Casting: " + b);

        float marks = 99.9999f;
        int marks2 = (int) marks;
        System.out.println("Type Casting1: " + marks2);
    }
}