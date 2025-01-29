
import java.util.*;

public class print3largest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type First Number :");
        int A = sc.nextInt();
        System.out.print("Type Second Number :");
        int B = sc.nextInt();
        System.out.print("Type Third Number :");
        int C = sc.nextInt();

        if (A >= B && A >= C) {
            System.out.println("The largest number is: " + A);
        } else if (B >= C && B >= C) {
            System.out.println("The largest number is: " + B);
        } else {
            System.out.println("The largest number is: " + C);
        }
        sc.close();
    }
}
