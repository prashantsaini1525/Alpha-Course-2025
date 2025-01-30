import java.util.*;

public class Fever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // double temp = 103.5;

        System.out.print("Enter Your temperature  : ");
        double temp = sc.nextDouble();

        if(temp >= 103.5) {
            System.out.println("You have a Fever");
        }
        else {
            System.out.println("You do not have a Fever");
        }
        sc.close();
    }
}
