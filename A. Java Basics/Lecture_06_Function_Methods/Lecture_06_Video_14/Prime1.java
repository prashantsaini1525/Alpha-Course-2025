
public class Prime1 {

    //only for n>= 2
    public static boolean isPrime(int n) {

        //corner cases
        //2
        // if (n == 2) {
        //     return true;
        // }

        // boolean isPrime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
                // isPrime = false;
                // break;
            }
        }
        return true;
        // return isPrime;
    }

    public static void main(String[] args) {
        // int n = 5;
        System.out.println("Your number is prime : " + isPrime(6));
    }
}
