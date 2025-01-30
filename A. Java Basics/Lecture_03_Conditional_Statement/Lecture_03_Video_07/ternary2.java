import java.util.*;

public class ternary2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the First number is :");
        int A = sc.nextInt();

        System.out.print("Enter the Second number is :");
        int B = sc.nextInt();
        
        System.out.print("Enter the third number is :");
        int C = sc.nextInt();

        String Result = (A >= B && A >= C) ? "A is the largest Number" : (B >= C && B >= A) ? "B is the largest Number" : "C is the largest Number";

        System.out.println(Result);

        sc.close();
    }
    
}
