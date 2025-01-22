
import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        
        /*float base = sc.nextFloat();
        float height = sc.nextFloat();
        float Area = (1/2f * (base * height));
        System.out.println("Area of Triangle : " + Area); */

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int Perimeter = a + b + c ;
        System.out.println("Perimeter of a triangle : " + Perimeter);
    }
}
