public class Swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        //swap
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("After swapping: a = " + a);
        System.out.println("After swapping: b = " + b);
    }
}
