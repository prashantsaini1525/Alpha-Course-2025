import java.util.*;

public class Halfpyramindnorepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Number: ");
        int n = sc.nextInt();

        int num = 1;

        for(int line = 1; line <= n; line++) {
            for(int number = 1; number <= line; number++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
    
}
