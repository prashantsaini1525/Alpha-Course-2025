
import java.util.Scanner;

public class Trianglesidechecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the side of the triangle A: ");
        int A = sc.nextInt();
        System.out.println("Enter the side of the triangle B: ");
        int B = sc.nextInt();
        System.out.println("Enter the side of the triangle C: ");
        int C = sc.nextInt();

        if ((A + B > C) && (A + C > B) && (B + C > A)) {

            if (A == B && B == C) {
                System.out.println("The given sides form an equilateral triangle.");
            } else if (A == B || A == C || B == C) {
                System.out.println("The given sides form an isosceles triangle.");
            } else {
                System.out.println("The given sides form a scalene triangle.");
            }
        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }

    }

}


