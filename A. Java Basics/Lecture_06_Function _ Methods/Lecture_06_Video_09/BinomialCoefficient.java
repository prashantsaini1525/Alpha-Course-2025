public class BinomialCoefficient {

    public static int factorial(int n) {
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f *= i;
        }

        return f; //factorial of n
    }

    public static int binCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_n_minus_r = factorial(n - r);

        int binCoeff = fact_n / (fact_r * fact_n_minus_r);
        return binCoeff;
    }

    public static void main(String[] args) {
        System.out.println(binCoeff(5, 2));
    }

}
