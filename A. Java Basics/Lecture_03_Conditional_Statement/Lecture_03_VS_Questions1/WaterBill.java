import java.util.*;

public class WaterBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter water usage in liters: ");
        double usage = sc.nextDouble();

        double bill = 0;

        if (usage <= 50) {
            bill = usage * 5;
            // System.out.print("Total Bill : " + bill);
        }

        else if (usage > 50 && usage <= 100) {
            bill = usage * 7;
            // System.out.print("Total Bill : " + bill);
        }

        else if (usage > 100) {
            bill = usage * 10;
            // System.out.print("Total Bill : " + bill);
        }

        else {
            System.out.print("Invalid water usage!");
            return;
        }
        System.out.print("Total Bill: " + bill);
    }
}
