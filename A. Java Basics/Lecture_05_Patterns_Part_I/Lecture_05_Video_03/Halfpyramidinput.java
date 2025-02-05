import java.util.*;

public class Halfpyramidinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number : ");
        int number = sc.nextInt();

        for(int line = 1; line <= number; line++) {
            for(int num = 1; num <= line; num++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
    
}
