public class logicaland1 {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;
        int c = 30;
        
        System.out.println(a < b && b < c); // true
        System.out.println(a < b && b > c); // false
    }
}
