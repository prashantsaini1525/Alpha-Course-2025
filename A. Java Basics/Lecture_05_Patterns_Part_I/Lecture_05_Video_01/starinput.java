import java.util.*;

public class starinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Number to Print Right Angle :");
        int num = sc.nextInt();

        for(int line = 1; line <= num; line++) {
            for(int j = 1; j <= line; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
