import java.util.Scanner;

public class ProperParametersSyntax {
    public static void claculatesum(int a, int b ){  //parameters or formal parameters
        int sum = a + b;
        System.out.println("Sum is : " + sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number:");
        int a = sc.nextInt();
        System.out.print("Enter Second number:");
        int b = sc.nextInt();
        claculatesum(a, b); //arguments or actual parameters
    }
}
