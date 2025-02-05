
import java.util.*;

public class Butterfly3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        //Upper half of the pyramid
        for (int line = 1; line <= n; line++) {
            // Left Stars 
            for (int stars = 1; stars <= line; stars++) {
                System.out.print("*");
            }
            // Spaces
            for (int stars = 1; stars <= 2 * (n - line); stars++) {
                System.out.print(" ");
            }
            // Right Stars
            for (int stars = 1; stars <= line; stars++) {
                System.out.print("*");
            }
            System.err.println();
        }

        // Lower half of the pyramid
        for (int line = n; line >= 1; line--) {
            // Left Stars
            for (int stars = 1; stars <= line; stars++) {
                System.out.print("*");
            }
            //Spaces
            for (int stars = 1; stars <= 2 * (n - line); stars++) {
                System.out.print(" ");
            }
            // Right Stars
            for (int stars = 1; stars <= line; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
