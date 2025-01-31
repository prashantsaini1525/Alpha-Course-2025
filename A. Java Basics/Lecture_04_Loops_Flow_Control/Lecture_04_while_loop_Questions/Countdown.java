import java.util.*;

public class Countdown {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Countdown Time : ");
        int time = sc.nextInt();

        while(time > 0) {
            System.out.println("Count Down : " +time);
            time--;
        }
        System.out.println("Time's Up!");
        sc.close();
    }
    
}
