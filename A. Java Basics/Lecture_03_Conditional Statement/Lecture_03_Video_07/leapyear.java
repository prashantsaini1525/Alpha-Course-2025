
import java.util.*;

public class leapyear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year:");
        int year = sc.nextInt();

        String Result = (year % 400 == 0) ? "It's a Leap year"
                : (year % 100 == 0) ? "It's a Leap year"
                        : (year % 4 == 0) ? "It's a Leap year"
                                : "It's not a Leap year";

        System.out.println(Result);

    }

}
