public class Invertques6 {
    public static void main(String[] args) {
        int n = 5;

        for(int line = 1; line <= n; line++) {
            //print spaces first
            for(int number = 1; number <= n - line; number++) {
                System.out.print(" ");
            }

            for(int number = 1; number <= line; number++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}