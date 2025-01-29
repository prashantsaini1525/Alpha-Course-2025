
public class agecomparison {

    public static void main(String[] args) {
        int A = 18;
        int B = 60;
        int C = 10;

        if (A < B && A < C) {
            System.out.println("A is minor");
        }
        if (B >= A && B >= C) {
            System.out.println("B is Adult");
        } else {
            System.out.println("C is Senior");
        }
    }
}
