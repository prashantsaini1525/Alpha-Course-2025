// Step 1: Import Scanner
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cups = 10; // Step 2: Initialize cups
        
        while (cups > 0) { // Step 3: Continue while cups > 0
            System.out.print("Do you want coffee? (yes/no): ");
            String input = sc.next(); // Step 4: Take user input
            
            if (input.equalsIgnoreCase("no")) { // Step 5: Exit if "no"
                System.out.println("Thank you! Have a nice day.");
                break;
            }
            
            // Step 6: Serve coffee
            System.out.println("Serving coffee... Enjoy!");
            cups--; // Reduce cup count
            System.out.println("Cups left: " + cups);
            
            // Step 7: Check if out of stock
            if (cups == 0) {
                System.out.println("Out of stock!");
            }
        }
        sc.close();
    }
}
