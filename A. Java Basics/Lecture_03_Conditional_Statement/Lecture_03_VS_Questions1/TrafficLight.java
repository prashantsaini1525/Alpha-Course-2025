import java.util.*;

public class TrafficLight  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter traffic light color : ");
        String color = sc.next();

        switch (color) {
            case "Red":
                System.out.println("Stop! The light is Red.");
                break;
            case "Yellow":
                System.out.println("Warning! The light is Yellow.");
                break;
            case "Green":
                System.out.println("Go! The light is Green.");
                break;
            default:
                System.out.println("Invalid color entered.");
                break;
        }
    }
    
}
