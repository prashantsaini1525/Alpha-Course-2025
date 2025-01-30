
import java.util.*;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.print("Enter c : ");
        int c = sc.nextInt();
        System.out.print("Enter Operator (+, -, *, /, %) : ");
        char operator = sc.next().charAt(0);

        // Check for division by zero
        if ((operator == '/' || operator == '%') && (b == 0 || c == 0)) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            // Perform operations based on operator
            switch (operator) {
                case '+':
                    System.out.println(a + b + c);
                    break;
                case '-':
                    System.out.println(a - b - c);
                    break;
                case '*':
                    System.out.println(a * b * c);
                    break;
                case '/':
                    // Handle division with double for accurate result
                    double result = (double) a / b / c;
                    System.out.println("Result: " + result);
                    break;
                case '%':
                    System.out.println(a % b % c);
                    break;
                default:
                    System.out.println("Invalid operator");

            }
        }
    }
}