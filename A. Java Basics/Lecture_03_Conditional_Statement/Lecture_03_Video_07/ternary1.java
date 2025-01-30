import java.util.*;

public class ternary1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("First number is :");
        int A = sc.nextInt();

        System.out.print("Second number is :");
        int B = sc.nextInt();

        String type = (A > B)? "A is the Largest Number" : (A < B) ? "B is the Largest Number" : "Both Numbers are equal.";
        
        System.out.println(type);
    }
    
}
