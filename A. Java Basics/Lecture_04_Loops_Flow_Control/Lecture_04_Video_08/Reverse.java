
public class Reverse {
    public static void main(String[] args) {
        
        int n = 150702;

            for(int i = 1; i <= 6; i++) {
                int lastdigit = n % 10;
                System.out.print(lastdigit);
                n = n / 10;  // removes the last digit from the number
            }
            System.out.println();
        }
        
    }

