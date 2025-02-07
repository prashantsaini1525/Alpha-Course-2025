import java.util.*;

public class EvenChecker1 {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isEven(num)) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
        // Alternatively, you can test with some hard-coded values:
        System.out.println("\nTesting with hard-coded values:");
        int[] testNumbers = {0, 1, 2, 3, 4, -1, -2};
        for (int n : testNumbers) {
            System.out.println("Is " + n + " even? " + isEven(n));
        }
        
        sc.close();
    }
    
}
