
public class FunctionDatatypes {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static long sum(long a, long b) {
        return a + b;
    }

    public static short sum(short a, short b) {
        return (short) (a + b);
    }

    public static String sum(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Sum of Int : " + sum(20, 10));
        System.out.println("Sum of float : " + sum(20.5f, 10.5f));
        System.out.println("Sum of double : " + sum(20.5, 10.5));
        System.out.println("Sum of long : " + sum(2000000000L, 1000000000L));
        System.out.println("Sum of short : " + sum((short) 20, (short) 10));
        System.out.println("Sum of String : " + sum("20", "10")); // This line will throw an error
    }
}
