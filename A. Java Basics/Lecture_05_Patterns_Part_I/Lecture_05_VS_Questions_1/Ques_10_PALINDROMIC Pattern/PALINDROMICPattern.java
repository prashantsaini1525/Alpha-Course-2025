
import java.util.*;

public class PALINDROMICPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Total Number of Rows : ");
        int totalRows = sc.nextInt();

        for (int rows = 1; rows <= totalRows; rows++) {
            for (int spaces = 1; spaces <= totalRows - rows; spaces++) {
                System.out.print(" ");
            }
            for (int decreasing = rows; decreasing >= 1; decreasing--) {
                System.out.print(decreasing);
            }
            for (int increasing = 2; increasing <= rows; increasing++) {
                System.out.print(increasing);
            }
            System.out.println();
        }
    }

}
