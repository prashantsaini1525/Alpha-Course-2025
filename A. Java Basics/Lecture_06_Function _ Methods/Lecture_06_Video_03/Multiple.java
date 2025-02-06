
import java.util.Scanner;

public class Multiple {
    
    public static int Multiple(int a, int b) { //parameters or formal parameters
        int Multiple = a * b;
        return Multiple;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        int Multiple = Multiple(a, b); //arguments or actual parameters
        System.out.println("The multiplication of " + a + " * " + b + " is: " + Multiple);
    }
}
