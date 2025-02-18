
public class Adddigit {
    //Time Complexity: O(log n)
    // Space Complexity: O(1) (constant space)

    // Adds all digits once // Always stops after one iteration
    static int calculateDigitSum(int number) {  //calculates the sum
        int sum = 0;
        while (number > 0) {
            sum += number % 10; // sum = sum + n % 10
            number = number / 10;
        }
        return sum;
    }

    // Adds digits repeatedly until it's a single digit
    // Stops when result is one digit
    public int addDigits(int num) { //getSingleDigit
        while (num > 9) {
            int sum = calculateDigitSum(num);
            num = sum;
        }
        return num;
    }
}
