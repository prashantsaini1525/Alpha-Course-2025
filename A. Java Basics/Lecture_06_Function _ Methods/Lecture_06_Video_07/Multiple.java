
import java.util.Scanner;

public class Multiple {
    
    public static int Multiply(int a, int b) { //parameters or formal parameters
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        int prod = Multiply(a, b); //arguments or actual parameters
        System.out.println("The multiplication of " + a + " * " + b + " is: " + prod);
        
        prod = Multiply(20, 10);
        System.out.println("The multiplication of 20 * 10 is: " + prod);
    }
}
