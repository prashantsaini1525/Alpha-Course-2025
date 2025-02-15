import java.util.*;

public class ParametersSyntax {

    //with void
    public static void printHelloWorld()  {
        System.out.println("Hello, World!");
    }

    //with return type int
    public static int printHelloWorld1()  {
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        return 2;
    }

    //with parameters int a, int b
    public static int calculatesum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number:");
        int a = sc.nextInt();
        System.out.print("Enter Second number:");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("Sum is : " + sum);
        return sum; //returning the sum to the caller function
    }

    //main method
    public static void main(String[] args) {
        printHelloWorld();
        printHelloWorld1();
        calculatesum();
    }
}
