import java.util.*;

public class Prime1OrNot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Number: ");
        int n = sc.nextInt();

        // Handling edge cases
        if (n <= 1) { //Prime numbers are greater than 1,
            System.out.println(n + " is not a Prime Number"); // Numbers less than or equal to 1 are not prime
        } else if (n == 2) {
            System.out.println(n + " is a Prime Number"); // 2 is prime
        } else {
            boolean isPrime = true; // Assume n is prime initially
            // Check divisibility from 2 to sqrt(n)
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) { // n is divisible by i, so it's not prime
                    isPrime = false;
                    break; // Exit the loop early, no need to check further
                }
            }

            // After the loop, print whether the number is prime or not
            if (isPrime) {
                System.out.println(n + " is a Prime Number");
            } else {
                System.out.println(n + " is not a Prime Number");
            }
        }

        sc.close(); // Close the scanner to avoid resource leak
    }
}
