
public class BottomHalfPyramid5 {

    public static void main(String[] args) {
        int n = 5;

        for(int line = n; line >= 1; line--) {
            for(int number = 1; number <= line; number++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
