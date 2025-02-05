public class Triangle01 {
    public static void main(String[] args) {
        int n = 5;

        for(int line = 1; line <= n; line++) {
            for(int number = 1; number <= line; number++) {
                if((line + number) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    
}
