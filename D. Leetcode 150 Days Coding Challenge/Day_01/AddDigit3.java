
public class AddDigit3 {
    //Time Complexity: O(1) (constant time)
    //Space Complexity: O(1) (constant space)
    
    //This function calculates the digital root directly using a mathematical formula, which is a shortcut for calculating the sum of digits repeatedly until it results in a single digit
    public static int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + (num - 1) % 9;
    }

    public static void main(String[] args) {
        int result = addDigits(123456);
        System.out.println("Sum of digits: " + result);
    }
}
