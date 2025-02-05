
import java.util.*;

public class Ques4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Table of Number : ");
        int n = sc.nextInt();

        int table = 0;

        for (int i = 1; i <= 10; i++) {
            table = i * n;
            System.out.println(n + " x " + i + " = " + table);
        }
        sc.close();
    }
}
