import java.util.*;

public class Difference {

    public static int Difference(int a, int b) { //parameters or formal parameters
        int difference = a - b;
        return difference;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int difference = Difference(a, b); //arguments or actual parameters
        System.out.println("Difference of Two Numbers : " + difference);
    }
    
}
