
import java.util.Scanner;


public class Reverseforloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = 15072002;

        System.out.println("Enter your number : ");
        int num = sc.nextInt();
        
        int rev = 0; 
        int tempnum = num;

        int numDigits = (int) Math.log10(num) + 1;  // Get the number of digits


        for(int i = 1; i <= numDigits; i++) {
            int lastdigit = tempnum % 10;
            rev = rev * 10 + lastdigit;
            tempnum = tempnum / 10;
        }
        System.out.println("Reversed number: " + rev);
    }
}
