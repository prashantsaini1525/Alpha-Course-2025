public class ReverseInteger {
    public static int reverse(int x) {
        long reversedNum = 0;

        boolean neg = false;
        if (x < 0) {
            neg = true;
            x = x * (-1);
        }

        while (x > 0) {
            int lastDigit = x % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE) {
                return 0;
            }
            x = x / 10;
        }
        return neg ? (int) reversedNum * (-1) : (int) reversedNum;
    }

    public static void main(String[] args) {
        int result = reverse(123456789);
        System.out.println("Reversed number: " + result);
    }
}
