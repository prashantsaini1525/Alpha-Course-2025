
import java.util.Scanner;

public class Divide {

    public static int Division(int a,  int b) { //parameters or formal parameters
        int divide = a / b;
        return divide; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int Divide = Division(a, b); //arguments or actual parameters
        System.out.println("Division of " + a + " / " + b + " is: " + Divide);
    }
}
