
import java.util.*;

public class switchstatement1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Number :");
        int number = sc.nextInt();

        // Issues with this approach:
// Uses break statements unnecessarily
// Each case must explicitly end with break to prevent fall-through.
// Forgetting break can cause unintended execution of multiple cases.
// More lines of code, harder to read
// The repeated use of case and break makes it less readable.
        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number");
        }
        sc.close();
    }

}
