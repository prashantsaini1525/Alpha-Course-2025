
import java.util.*;

public class NumberPyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int totalrows = sc.nextInt();

        for (int rows = 1; rows <= totalrows; rows++) {
            for (int spaces = 1; spaces <= totalrows - rows; spaces++) {
                System.out.print(" ");
            }
            for (int number = 1; number <= rows; number++) {
                System.out.print(rows + " ");
            }
            System.out.println();
        }
    }

}
