import java.util.*;

public class Halfpyramidinputinvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Number : ");
        int n = sc.nextInt();

        for(int line = 1; line <= n; line++) {
            for(int number = 1; number <= (n-line+1); number++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
    
}
