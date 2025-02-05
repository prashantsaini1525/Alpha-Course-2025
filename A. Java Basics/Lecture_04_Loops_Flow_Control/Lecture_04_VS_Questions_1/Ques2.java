
import java.util.*;

public class Ques2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int evensum = 0;
        int oddsum = 0;

        System.out.print("Enter Number :");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                evensum += i;
            } else {
                oddsum += i;
            }
        }
        System.out.println("Total of Even Numbers : " + evensum);
        System.out.println("Total of Odd Numbers : " + oddsum);
    }

}
