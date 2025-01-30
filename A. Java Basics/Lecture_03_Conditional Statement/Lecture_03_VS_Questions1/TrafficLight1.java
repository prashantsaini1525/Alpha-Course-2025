import java.util.*;

public class TrafficLight1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the time (in seconds) since the last signal change: ");
        int time = sc.nextInt();

        if (time >= 1 && time <= 30) {
            System.out.println("The traffic light is green.");
        } else if (time > 30 && time <= 60) {
            System.out.println("The traffic light is yellow.");
        } else if (time > 60 && time <= 90) {
            System.out.println("The traffic light is red.");
        }
        else {
            System.out.println("Invalid input. Please enter a time between 1 and 90 seconds.");
        }
    }
}
