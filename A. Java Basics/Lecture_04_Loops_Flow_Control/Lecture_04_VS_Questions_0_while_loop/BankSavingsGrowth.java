
public class BankSavingsGrowth {
    public static void main(String[] args) {
        double balance = 1000; // Initial deposit
        double interestRate = 0.05; // 5% interest per year
        int years = 0; // Counter for years

        while (balance < 2000) { // Run until balance reaches ₹2000
            balance += balance * interestRate; // Add 5% interest
            years++; // Increase the year count
            System.out.printf("Year %d: Balance = %.2f\n", years, balance); // Print yearly progress
        }

        System.out.println("It will take " + years + " years to reach ₹2000.");
    }
}
