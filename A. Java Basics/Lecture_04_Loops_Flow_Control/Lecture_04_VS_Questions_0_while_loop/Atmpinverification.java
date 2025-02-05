import java.util.*;

public class Atmpinverification {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int attempts = 3;  // Maximum attempts
        int PIN = 2515; // Correct PIN

        while (attempts > 0) {
            System.out.println("Enter Your PIN : ");
            int userPin = sc.nextInt();

            if (userPin == PIN) {
                System.out.println("Access Granted!");
                return;  // Exit the program after successful login
            } else {
                attempts--; //Reduce attempts
                if (attempts > 0) {
                    System.out.println("Incorrect PIN. Try again. Attempts Left : " + attempts);
                } else {
                    System.out.println("Access Denied! Maximum attempts exceeded.");
                }
            }
        }
        sc.close();
    }
    
}
