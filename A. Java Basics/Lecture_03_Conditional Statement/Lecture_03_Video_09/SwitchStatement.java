public class SwitchStatement {
    public static void main(String[] args) {
        int number = 2;
        switch(number) {
            //In switch statement if one statement is executed then the other statement will also be executed.
            case 1 : System.out.println("samosa");
            case 2 : System.out.println("pizza");
            case 3 : System.out.println("burger");
            default : System.out.println("Unknown food");
        }
    }
}
