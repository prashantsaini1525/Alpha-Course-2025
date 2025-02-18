public class AddDigit1 {
    //Time Complexity: O(log n)
    // Space Complexity: O(1) (constant space)

    // Adds all digits once // Always stops after one iteration
    public static int calculateDigitSum(int number){ //calculates the sum
        int sum = 0;
        while(number > 0) {
            sum +=  number % 10; //sum = sum + n % 10
            number /= 10;
        }
        return sum;
    }

    // Adds digits repeatedly until it's a single digit 
    //Stops when result is one digit
    public static int addDigits(int num) { //getSingleDigit
        while (num > 9) {
            int sum = calculateDigitSum(num);
            num = sum;
        }
        return num;
    }

    public static void main(String[] args) { // main function
        int result1 = calculateDigitSum(9874564); //Adds all digits once
        int result2 = addDigits(9874564); //Adds digits repeatedly until it's a single digit 
        System.out.println("Sum of Digits (once): " + result1
                + ", Final Single Digit: " + result2);
    }
}