public class InvertedRotatedHalfPyramid {

    public static void inverted_rotated_half_pyramid(int n) {
        //Outer loop for each row/ Outer loop for each line
        for(int i = 1; i <= n; i++) {
            //Inner Loop for Spaces
            for(int j = 1; j <= n - i; j++) {
                //Print Spaces for the left side of the pyramid
                System.out.print(" ");
            }
            //Inner loop for Stars 
            for(int j = 1; j <= i; j++) {
                //Print Stars for the right side of the pyramid
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inverted_rotated_half_pyramid(5);
    }
}
