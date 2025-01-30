import java .util.*;

public class Discount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total purchase amount : ");
        double totalAmount = sc.nextDouble();

        // double discountAmount = sc.nextDouble();
        if (totalAmount >= 5000) {
            double discountedAmount = totalAmount - (totalAmount * 20 / 100);
            System.out.printf("Discounted Amount : %.2f\n" , discountedAmount);

        // } else if (totalAmount >= 2000 && totalAmount < 5000) {
        } else if (totalAmount >= 2000) {
            double discountedAmount = totalAmount - (totalAmount * 10 / 100);
            System.out.printf("Discounted Amount : %.2f\n" , discountedAmount);

        // } else if (totalAmount < 2000 && totalAmount > 0) {
        } else if (totalAmount > 0) {
            System.out.println("No discount applicable. Total purchase amount is less than 2000.");
        
        } else {
            System.out.println("Invalid total purchase amount entered.");
        }
        sc.close();

    }

}
