public class HollowRectangle {
    public static void main(String[] args) {

        int rows = 5, cols = 5; // Rectangle size
        
        for(int line = 1; line <= rows; line++) { // for through row
            for(int num = 1; num <= cols; num++) { // for through column
                if (line == 1 || line == rows) {
                    System.out.print(" * ");
                }
                else if (num == 1 || num == cols) {
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
