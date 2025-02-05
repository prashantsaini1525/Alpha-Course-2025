public class InvertedHalfPyramid2 {
    public static void main(String[] args) {
        int n = 5;

        for(int line = 1; line <= 5; line++) {
            for(int number = 1; number <= (n - line +1); number++) {
                System.out.print(number);
            } 
            System.out.println();
        }
    } 
    
}
