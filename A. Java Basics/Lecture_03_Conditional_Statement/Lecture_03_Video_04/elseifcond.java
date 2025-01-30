import java.util.*;

public class elseifcond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int age = sc.nextInt();

        if (age >= 18 && age <= 100) {
            System.out.println("You are Adult.");
        }

        else if (age >= 13 && age <= 18) {
            System.out.println("You are a teenager.");
        }
        else if (age >100) {
            System.out.println("Invalid age");
        }
        else {
            System.out.println("Child");
        }

    }
    
}
