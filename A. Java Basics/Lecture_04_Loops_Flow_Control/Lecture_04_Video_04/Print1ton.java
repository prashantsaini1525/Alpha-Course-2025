import java.util.*;

public class Print1ton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Range : ");
        int range = sc.nextInt();
        int counter = 1;

        while(counter <= range) {
            System.out.println(counter + " ");
            counter++; // increment counter by 1 each iteration
        }
        System.out.println();
    }
    
}
