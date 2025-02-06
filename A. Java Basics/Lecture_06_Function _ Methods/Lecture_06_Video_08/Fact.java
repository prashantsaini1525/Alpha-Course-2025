
import java.util.*;

public class Fact {

    public static int factorial(int n) {
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f *= i;
        }

        return f; //factorial of n
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt(); // or any other value you want to calculate the factorial for

        factorial(n);
        // System.out.println(factorial(n));
        System.out.println("Factorial of " + n + " is: " + factorial(n));
    }

}
