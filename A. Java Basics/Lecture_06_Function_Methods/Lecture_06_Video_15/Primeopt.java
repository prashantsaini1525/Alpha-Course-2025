
public class Primeopt {

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;  // n is a prime number
    }

    public static void main(String[] args) {
        System.out.println("Your number is prime : " + isPrime(6));
    }
}
