
import java.util.*;

public class Harshad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int num = sc.nextInt();

        int sum = 0;
        int temp = num; //store original value

        while (temp > 0) {
            sum = sum + temp % 10;
            temp /= 10; // remove last digit from number
        }
        // Check if the number is a Harshad Number
        if (num % sum == 0) {
            System.out.println(num + " is a Harshad Number.");
        } else {
            System.out.println(num + " is NOT a Harshad Number.");
        }

        sc.close(); // Close scanner
    }
}
