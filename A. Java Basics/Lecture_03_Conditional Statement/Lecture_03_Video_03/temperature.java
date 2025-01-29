
import java.util.Scanner;

public class temperature {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        int temperature = sc.nextInt();

        if (temperature < 10) {
            System.out.println("It's too cold! Wear warm clothes!");
        }
        if (temperature >= 10 && temperature <= 30) {
            System.out.println("The weather is pleasant. Enjoy your day!");
        } else {
            System.out.println("It's too hot! Stay hydrated & Stay inside!");
        }
        sc.close();
    }
}
