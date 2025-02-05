import java.util.*;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Number: ");
        int n = sc.nextInt();

        int totalNumbers = (n * (n + 1)) / 2; // Total numbers to be printed
        int start = totalNumbers - n + 1; // Start number for the first row

        for (int line = n; line >= 1; line--) {
            int temp = start;
            for (int count = 1; count <= line; count++) {
                System.out.print(temp + " ");
                temp++;
            }
            start -= (line - 1); // Adjust the starting number for the next row
            System.out.println();
        }

        sc.close(); // Good practice: Close the scanner
    }
}
