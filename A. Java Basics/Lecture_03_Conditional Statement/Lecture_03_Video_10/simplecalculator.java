import java.util.*;

public class simplecalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();

        System.out.print("Enter Operator (+, -, *, /, %) : ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            case '*':
                System.out.println("Result: " + (a * b));
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Error: Division by zero.");
                } else {
                    System.out.println("Result: " + (double) a / b);
                }
                break;
            case '%':
                System.out.println("Result: " + (a % b));
                break;
            default:
                System.out.println("Error: Invalid operator.");
            }
    }
    
}
