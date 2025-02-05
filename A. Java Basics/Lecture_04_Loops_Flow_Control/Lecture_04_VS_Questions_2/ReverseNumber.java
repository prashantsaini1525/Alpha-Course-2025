
import java.util.*;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int reversed = 0;
        System.out.print("Enter Your Number : ");
        int num = sc.nextInt();

        while (num > 0) {
            int lastdigit = num % 10;
            reversed = reversed * 10 + lastdigit;
            // System.out.println("number : " + lastdigit);
            num /= 10;
        }
        System.out.println("Reversed Number : " + reversed);
        sc.close(); // Close scanner
    }
}
