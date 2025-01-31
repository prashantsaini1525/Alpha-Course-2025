public class water {
    public static void main(String[] args) {
        
        int waterlevel = 0;
        int level = 1;

        while (waterlevel < 10) {
            waterlevel += level;
            System.out.println("Level: " + level + ", Water level: " + waterlevel);
        }
        System.out.println("The water level has reached the top.");


    }
}