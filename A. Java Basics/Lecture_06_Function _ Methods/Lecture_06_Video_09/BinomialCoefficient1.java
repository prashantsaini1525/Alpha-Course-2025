import java.util.*;

public class BinomialCoefficient1 {

    public static int factorial(int n) {
        int f = 1;

        for(int i = 1; i <= n; i++) {
            f *= i;
        }
        return f; // return
    }

    public static int binCoeff(int n,  int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter the Value of r : ");
        int r = sc.nextInt();

        binCoeff(n, r);
        System.out.println("Binomial Coefficient of " + n + " choose " + r + " is: " + binCoeff(n, r));
        // System.out.println(binCoeff(5, 2));
    }
    
}
