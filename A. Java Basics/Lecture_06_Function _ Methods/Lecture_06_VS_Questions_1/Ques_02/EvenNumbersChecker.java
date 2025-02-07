import java.util.Scanner;

public class EvenNumbersChecker {

    // Function to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of integers to check: ");
        int n = sc.nextInt();
        // Loop through each number
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();
            
            // Check if the current number is even or odd
            if (isEven(num)) {
                System.out.println(num + " is even.");
            } else {
                System.out.println(num + " is odd.");
            }
        }
        
        sc.close();
    }
}
