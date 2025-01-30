import java.util.*;

public class numbercheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("Number is Positive");
        }
        else if (number < 0) {
            System.out.println("Number is Negative");
        }
        else if (number == 0) {
            System.out.println("Number is Zero");
        }
        else {
            System.out.println("Invalid Number");
        }
    }
}