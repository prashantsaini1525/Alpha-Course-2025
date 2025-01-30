
import java.util.*;

public class Weekdays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Week number : ");
        int weekNumber = sc.nextInt();

        if (weekNumber >= 1 && weekNumber <= 7) {

            switch (weekNumber) {
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
            }
        } else {
            System.out.println("Invalid week number! Please enter a number between 1 and 7.");
        }
    }

}
