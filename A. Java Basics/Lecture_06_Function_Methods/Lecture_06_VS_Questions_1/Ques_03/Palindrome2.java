import java.util.*;

public class Palindrome2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        // used while for to get reverse numbers
        while (num > 0){
            int lastDigit = num % 10; // Extract last digit
            reversedNum = reversedNum * 10 + lastDigit;  // Build reversed number
            num /= 10; // Remove last digit
        }

        return originalNum == reversedNum;
    }
}
