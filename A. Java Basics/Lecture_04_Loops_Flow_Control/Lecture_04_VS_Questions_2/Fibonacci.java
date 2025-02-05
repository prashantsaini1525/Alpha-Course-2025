import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of terms: ");
        int n = sc.nextInt();

        int fibonacci;
        int a = 0, b = 1; //first two fibonacci numbers

        System.out.print("Fibonacci Series: " + a + " " + b);

        for(int i = 2; i < n; i++) {  // Loop starts from 2 since 0 and 1 are already printed
            fibonacci = a + b;
            System.out.print(" " + fibonacci);
            a = b; // Move to the next number
            b = fibonacci;
        }
        sc.close();
    }
}
