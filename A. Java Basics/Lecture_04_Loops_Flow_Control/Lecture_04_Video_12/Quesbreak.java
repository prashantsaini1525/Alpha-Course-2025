
import java.util.*;

public class Quesbreak {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter Number which should be multiple of 10 : ");
            int n = sc.nextInt();

            if (n % 10 == 0) {
                System.out.println("Congratulations! you exit the loop!");
                break;
            }
            System.out.println(n + " is not divisible by 10");
            
        } while (true);
    }
}
