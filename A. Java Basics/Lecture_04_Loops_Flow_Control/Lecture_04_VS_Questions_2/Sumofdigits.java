import java.util.*;

public class Sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int reversed = 0;
        int product = 1;
        // int armstrongSum = 0;
        
        System.out.print("Enter your number : ");
        int number = sc.nextInt();
        
        int tempnumber = number;

        // ✔ Calculates sum of digits
        // ✔ Counts the number of digits
        // ✔ Reverses the number
        // ✔ Product of digits
        // ✔ Checks if sum is even or odd
        // ✔ Checks for palindrome

        while(number > 0) {
            int lastdigit = number % 10;
            sum = sum + lastdigit;
            reversed = reversed * 10 + lastdigit;
            product *= lastdigit;
            // armstrongSum += Math.pow(lastdigit, count);
            number = number / 10;
            count++;
        }
        
        System.out.println("Sum of Number: " + sum);
        System.out.println("Count of Number: " + count);
        System.out.println("Reversed Number: " + reversed);
        System.out.println("Product of Number: " + product);
        // System.out.println("Sum of Cubes of Number: " + armstrongSum);

        if (sum % 2 == 0) {
            System.out.println("Sum of digits is Even");
        } else {
            System.out.println("Sum of digits is Odd");
        }
        
        if (tempnumber == reversed) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Number is not Palindrome");
        }
        
        // if (tempnumber == armstrongSum) {
        //     System.out.println("Number is an Armstrong Number");
        // } else {
        //     System.out.println("Number is NOT an Armstrong Number");
        // }
        
        sc.close(); // Close scanner
    }
    
}
