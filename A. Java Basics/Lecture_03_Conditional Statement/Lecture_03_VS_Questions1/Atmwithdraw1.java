import java.util.*;

public class Atmwithdraw1 {
    public static void main(String[] args) {
        int balance = 10000;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount to withdraw: ");
        int amount = sc.nextInt();

        if (amount % 100 == 0 && amount <= balance) {
            System.out.println("Transaction successful! Please collect " + amount + ".");
        }

        else if (amount % 100 != 0) {
            System.out.println("Error: Amount must be a multiple of 100.");
        }

        else if (amount > balance) {
            System.out.println("Error: Insufficient balance.");
        }

        sc.close();
    }
    
}
