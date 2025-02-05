import java.util.*;

public class invertedstarinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your input : ");
        int n = sc.nextInt();

        for(int line = 1; line <= n; line++) {
            for (int star = 1; star <= (n - line + 1); star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
