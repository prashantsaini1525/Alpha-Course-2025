import java.util.*;

public class Average {
    public static double Avg(double a, double b, double c) {
        // double Avg = (a+b+c)/3;
        // return Avg;
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Your Second Number : ");
        int b = sc.nextInt();
        System.out.print("Enter Your Third Number : ");
        int c = sc.nextInt();

        double Average = Avg(a, b, c);
        System.out.printf("Average is : %.3f", Average);
    }
    
}
