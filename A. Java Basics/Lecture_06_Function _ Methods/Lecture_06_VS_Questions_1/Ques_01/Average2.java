
import java.util.*;

public class Average2 {

    public static double Average(double sum, int n) {
        return (sum / n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();

        double sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter the " + i + "th element : ");
            double element = sc.nextDouble();
            sum = sum + element;
        }
        double average = Average(sum, n);
        // double average = sum / n;
        // Print the average and count of numbers
        System.out.printf("Average of %d numbers is: %.2f\n", n, average);
        System.out.println("Count of numbers: " + n);
    }
}
