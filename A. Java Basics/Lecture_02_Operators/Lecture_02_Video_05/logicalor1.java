public class logicalor1 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println((a < b) || (b < a));
        System.out.println((a < b) || (b > a));
        System.out.println((a > b) || (b < a));
        System.out.println((a > b) || (b > a));

    }
    
}
