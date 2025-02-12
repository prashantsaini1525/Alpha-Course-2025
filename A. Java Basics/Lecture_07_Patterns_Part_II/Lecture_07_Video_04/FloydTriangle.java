public class FloydTriangle {

    public static void floyds_triangle(int n) {
        //outer
        int counter = 1; // counter for triangle
        for(int i = 1; i <= n; i++) {
            //inner - how many times will counter be printed
            for(int j = 1; j <= i; j++) {
                System.out.print(counter+" ");
                counter++; // increment counter
            }
            System.out.println(); // new line for next row in the triangle
        }
    }
    public static void main(String[] args) {
        floyds_triangle(5);
    }
}
