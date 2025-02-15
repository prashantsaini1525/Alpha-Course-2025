public class Prime {
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for(int i = 2; i <= n - 1; i++) {
            if(n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        // int n = 5;
        System.out.println("Your number is prime : " + isPrime(5));
    }
    
}
