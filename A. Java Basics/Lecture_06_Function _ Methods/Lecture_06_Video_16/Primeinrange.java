public class Primeinrange {

    // Function to check if a number is prime
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

    // Function to print prime numbers between 2 and n
    public static void primesInRange(int n){
        for(int i = 2; i <= n; i++) {
            if(isPrime(i)) {
                System.out.print(i+ " ");  // Print prime numbers between 2 and n
            }
        }
        System.out.println();
    }

    // Driver code to test the above functions
    public static void main(String[] args) {
        primesInRange(100); //2 to 100
    }
}
