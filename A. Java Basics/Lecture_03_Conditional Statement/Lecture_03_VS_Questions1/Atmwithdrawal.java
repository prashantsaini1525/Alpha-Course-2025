
import java.util.*;

public class Atmwithdrawal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amount to Withdraw : ");
        int amount = sc.nextInt();

        // Check if the amount is a multiple of 100 or 2000
        if (amount % 100 == 0 || amount % 2000 == 0) {
            System.out.println("Transaction successful! Please collect " + amount);
        } else {
            System.out.println("Invalid amount. Please enter a multiple of 100 or 2000.");
        }

// Check for sufficient balance
        if (amount < 10000) {
            System.out.println("Insufficient balance. Please check your account balance.");
        }

        sc.close();
    }

}
