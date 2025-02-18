
public class ReverseInteger1 {

    public int reverse(int x) {
        int reversedNum = 0;

        while (x != 0) {
            int lastDigit = x % 10;

            // Check for overflow
            if (reversedNum > Integer.MAX_VALUE / 10 || (reversedNum == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
                return 0;
            }
            if (reversedNum < Integer.MIN_VALUE / 10 || (reversedNum == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
                return 0;
            }

            reversedNum = reversedNum * 10 + lastDigit;
            x = x / 10;
        }

        return reversedNum;
    }

    public static void main(String[] args) {
        ReverseInteger1 solution = new ReverseInteger1();

        System.out.println(solution.reverse(123));  // Output: 321
        System.out.println(solution.reverse(-123)); // Output: -321
        System.out.println(solution.reverse(120));  // Output: 21
        System.out.println(solution.reverse(0));    // Output: 0
    }
}
