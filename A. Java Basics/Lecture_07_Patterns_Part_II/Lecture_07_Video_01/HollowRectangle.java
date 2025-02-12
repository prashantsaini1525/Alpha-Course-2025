public class HollowRectangle {

    public static void hollow_rectangle(int totRows, int totCols) {
        //outer loop for each row
        for(int i = 1; i <= totRows; i++) {
            // inner loop for each column
            for(int j = 1; j <= totCols; j++) {
                if( i == 1 ||i == totRows || j == 1 || j == totCols ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // newline for next row
        }
    }
    public static void main(String[] args) {
        hollow_rectangle(5, 5);
    }
}
