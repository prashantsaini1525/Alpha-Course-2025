
import java.util.*;

public class LeapYear1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // switch only works with constants, variables, or expressions that evaluate to a single value. You cannot use boolean expressions like year % 400 == 0 as a case label.
        // Determine leap year (1 = Leap Year, 0 = Not a Leap Year)
        
        
        // This is a ternary operator statement that checks if a given year is a leap year and assigns either 1 (if it's a leap year) or 0 (if it's not).
        
        // int isLeap = (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) ? 1 : 0;

        //Same as above function.

        int isLeap;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            isLeap = 1;
        } else {
            isLeap = 0;
        }

        // Example Cases:
        // Year	     year % 400 == 0    year % 4 == 0       year % 100 != 0	        Leap Year?	    isLeap
        // 2000	    ✅ (true)	      ✅ (true)           ❌ (false)	            ✅ Yes	        1
        // 2024	    ❌ (false)	      ✅ (true)	         ✅ (true)	            ✅ Yes	        1
        // 1900	    ❌ (false)	      ✅ (true)	         ❌ (false)	            ❌ No	        0
        // 2100	    ❌ (false)	      ✅ (true)	         ❌ (false)	            ❌ No	        0

        // Use switch-case
        switch (isLeap) {
            case 1:
                System.out.println(year + " is a leap year.");
                break;
            case 0:
                System.out.println(year + " is not a leap year.");
                break;
        }

    }

}
