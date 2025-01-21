import java.util.*;


public class AreaofRectangle {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);


        /*int length = sc.nextInt();
        int width = sc.nextInt();
        int Area = length * width ;
        System.out.println("Area of Rectangle : " + Area); */


        int length = sc.nextInt();
        int width = sc.nextInt();
        int Perimeter = (2 * (length + width));
        System.out.println("Perimeter of Rectangle : " + Perimeter);
    }
    
}
