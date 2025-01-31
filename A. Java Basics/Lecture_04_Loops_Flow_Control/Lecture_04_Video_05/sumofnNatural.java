import java.util.Scanner;

public class sumofnNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Natural Number : ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i; //sum = sum + i
            i++;
        }
        System.out.println("Sum of Natural Number : " + sum);
        
    }
}
