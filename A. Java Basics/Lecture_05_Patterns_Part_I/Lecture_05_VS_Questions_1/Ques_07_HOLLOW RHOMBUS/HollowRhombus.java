
import java.util.*;

public class HollowRhombus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Rows : ");
        int totalRows = sc.nextInt();

        for (int rows = 1; rows <= totalRows; rows++) {
            for (int spaces = 1; spaces <= (totalRows - rows); spaces++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= totalRows; stars++) {
                if (rows == 1 || rows == totalRows) {
                    System.out.print("*");
                }
                else if (stars == 1 || stars == totalRows) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
