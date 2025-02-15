
import java.util.*;

public class SumofInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the integer : ");
        int number = sc.nextInt();

        System.out.println("The sum of integers " + number + " is : " + calculateSum(number));
    }

    public static int calculateSum(int num) {
        int sum = 0;
        // Error Explanation
        // You are using a for loop that runs from 1 to num, but the number of digits is unknown.
        // Instead, you should use a while loop to extract digits until num becomes 0.
        // for (int i = 1; i <= num; i++) {
        //     int lastDigit = num % 10;
        //     sum = sum + lastDigit;
        //     num = num / 10;
        // }
        // return sum;
        // Using while loop to process each digit
        while (num > 0) {
            int lastDigit = num % 10; // Extract last digit
            sum = sum + lastDigit; // Add last digit to sum
            num = num / 10; // Remove last digit
        }
        return sum;
    }
}
