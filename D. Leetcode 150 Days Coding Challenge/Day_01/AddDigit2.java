
public class AddDigit2 {

    //Time Complexity: O(1) (constant time)
    // Space Complexity: O(1) (constant space)
    //because we not using any loops or we not taking any extra memory for this code
    
    //mathematical shortcut to calculate the result directly without needing a loop or recursion
    public static int addDigits(int num) { 
        if (num == 0) {
            return 0;
        } else if (num % 9 == 0) {
            return 9;
        } else if (num > 9) {
            return num % 9; //num = 121 -> 121 % 9 = remainder = 4 //num = 11213 -> 11213 % 9 = remainder = 8 
        }
        return num;
    }

    public static void main(String[] args) {
        int result = addDigits(195);
        System.out.print("Final Single Digit : " + result);
    }
}
