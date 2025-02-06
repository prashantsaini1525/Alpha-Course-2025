import java.util.*;

public class SolidRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Stars for each lines : ");
        int n = sc.nextInt();

        for(int line = 1; line <= n; line++) {
            for(int rows = 1; rows <= (n-line); rows++) {
                System.out.print(" ");
            }
            for(int rows = 1; rows <= n; rows++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
