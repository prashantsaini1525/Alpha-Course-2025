import java.util.Scanner;

public class EvenNumbersCheckerWhile {

    // Method to check if a number is even.
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt for the number of elements
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int count = 1;
        // Use a while loop to process each number
        while (count <= n) {
            System.out.print("Enter number " + count + ": ");
            int num = sc.nextInt();
            
            // Check if the current number is even
            if (isEven(num)) {
                System.out.println(num + " is even.");
            } else {
                System.out.println(num + " is odd.");
            }
            
            count++;  // Increment the counter for the next iteration
        }
        
        sc.close();
    }
}
