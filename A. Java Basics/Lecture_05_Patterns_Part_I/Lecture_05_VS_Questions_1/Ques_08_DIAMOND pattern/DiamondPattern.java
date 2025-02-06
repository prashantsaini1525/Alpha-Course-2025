import java.util.*;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Total Number of Rows : ");
        int totalrows = sc.nextInt();

        //Upper Half (Pyramid)
        for(int rows = 1; rows <= totalrows; rows++) {
            for(int spaces = 1; spaces <= totalrows - rows; spaces++){
                System.out.print(" ");
            }
            for(int spaces = 1; spaces <= (2* rows -1); spaces++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int rows = totalrows - 1; rows >= 1; rows--){
            for(int spaces = 1; spaces <= totalrows - rows; spaces++){
                System.out.print(" ");
            }
            for(int spaces = 1; spaces <= (2* rows -1); spaces++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
