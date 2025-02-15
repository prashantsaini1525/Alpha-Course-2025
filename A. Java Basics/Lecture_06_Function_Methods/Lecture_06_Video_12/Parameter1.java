
import java.util.*;

public class Parameter1 {

    //Sum of 2 numbers
    public static int sum(int a, int b) {
        return a + b;
    }

    //Sum of 2 numbers
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    //Sub of 2 numbers
    public static int sub(int a, int b) {
        return a - b;
    }

    //Sub of 3 numbers
    public static int sub(int a, int b, int c) {
        return a - b - c;
    }

    //Mul of 2 numbers
    public static int mul(int a, int b) {
        return a * b;
    }

    //Mul of 2 numbers
    public static int mul(int a, int b, int c) {
        return a * b * c;
    }

    //Division of 2 numbers
    public static int div(int a, int b) {
        return a / b;
    }

    //Mod of 2 numbers
    public static int mod(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number (optional): ");
        int c = sc.nextInt();

        int SumResult = sum(a, b);
        int SumResult1 = sum(a, b, c);

        int SubResult = sub(a, b);
        int SubResult1 = sub(a, b, c);

        int MulResult = mul(a, b);
        int MulResult1 = mul(a, b, c);

        int DivResult = div(a, b);
        int ModResult = mod(a, b);

        System.out.println("Sum of " + a + " and " + b + ": " + SumResult);
        System.out.println("Sum of " + a + ", " + b + " and " + c + ": " + SumResult1);

        System.out.println("Subtraction of " + a + " from " + b + ": " + SubResult);
        System.out.println("Subtraction of " + a + ", " + b + " from " + c + ": " + SubResult1);

        System.out.println("Multiplication of " + a + " and " + b + ": " + MulResult);
        System.out.println("Multiplication of " + a + ", " + b + " and " + c + ": " + MulResult1);

        System.out.println("Division of " + a + " by " + b + ": " + DivResult);
        System.out.println("Modulus of " + a + " and " + b + ": " + ModResult);
    }
}
