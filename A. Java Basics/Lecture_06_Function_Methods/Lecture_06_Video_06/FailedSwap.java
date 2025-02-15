public class FailedSwap {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside swap(): a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("Before swap(): a = " + a + ", b = " + b);
        
        swap(a, b);
        System.out.println("After swap(): a = " + a + ", b = " + b); // No change!
        //  The values remain unchanged in main() because Java passes primitive values by copy.
    }

}
