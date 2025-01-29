import java.util.Scanner;

public class evendivisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }

        if (num % 7 == 0) {
            System.out.println(num + " is also divisible by 7.");
        }

        sc.close();
    }
}
