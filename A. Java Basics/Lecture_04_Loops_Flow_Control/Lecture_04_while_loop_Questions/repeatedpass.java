import java.util.*;

public class repeatedpass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int password = 2515;

        System.out.print("Enter your password: ");
        int input = sc.nextInt();

        while(password != input) {
            System.out.println("Incorrect password. Try again.");
            System.out.print("Enter your password: ");
            input = sc.nextInt();
        }
        
        System.out.println("Login successful!");
    }
    
}
