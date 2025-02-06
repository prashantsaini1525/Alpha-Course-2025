import java.util.Scanner;

public class ProperParametersSyntax1 {

    // Function to calculate sum of two numbers.
    public static int claculatesum(int a, int b ){
        int sum = a + b;
        return sum;
    }

    // Main method to test the function above.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter First number:");
        int a = sc.nextInt();
        System.out.print("Enter Second number:");
        int b = sc.nextInt();
        
        int sum = claculatesum(a, b);
        System.out.println("Sum is : " + sum);
    }
}
