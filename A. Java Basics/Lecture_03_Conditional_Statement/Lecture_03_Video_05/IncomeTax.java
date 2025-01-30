import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Fill the income : ");
        double income = sc.nextDouble();

        if (income < 500000) {
            System.out.println("No tax applicable below 5 lakh");
        }

        else if (income >= 500000 && income <= 1000000) {
            double tax = (income * 20) / 100;
            System.out.println("Tax amount After 20% Tax: " + tax);
        }

        else {
            double tax = (income * 30) / 100;
            System.out.println("Tax amount After 30% Tax: " + tax);
        }
    }
}
