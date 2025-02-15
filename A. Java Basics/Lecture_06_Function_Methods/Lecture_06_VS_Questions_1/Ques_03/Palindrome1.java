import java.util.*;

public class Palindrome1 {

    public static boolean isPalindrome(int number) {
        int Palindrome = number; // copied number into variable
        int reverse = 0;

        while (Palindrome != 0) {
            int remainder = Palindrome % 10;
            reverse = reverse * 10 + remainder;
            Palindrome /= 10; 
        }
        // if original and the reverse of number is equal means
        // number is palindrome in Java
        if(number == reverse) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.print("Please Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int palindrome = sc.nextInt();

        if(isPalindrome(palindrome)) {
            System.out.println("Number : " + palindrome + " is a Palindrome.");
        } else {
            System.out.println("Number : " + palindrome + " is not a Palindrome.");
        }
    }
}
