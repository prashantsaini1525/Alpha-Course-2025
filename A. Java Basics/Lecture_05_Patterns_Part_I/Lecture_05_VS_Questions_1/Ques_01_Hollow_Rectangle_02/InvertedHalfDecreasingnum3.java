package Ques_01_Hollow_Rectangle_02;
public class InvertedHalfDecreasingnum3 {
    public static void main(String[] args) {
        int n = 5;

        for(int line = 1; line <= 5; line++) {
            for(int number = 5; number >= line; number--) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
    
}
