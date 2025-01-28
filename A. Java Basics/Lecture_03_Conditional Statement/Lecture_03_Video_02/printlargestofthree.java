
public class printlargestofthree {

    public static void main(String[] args) {
        int A = 10;
        int B = 20;
        int C = 5;

        if (A >= B && A >= C) {
            System.out.println("A : I'm The Largest Of Three");
        }
        if (B >= C && B >= A) {
            System.out.println("B : I'm The Largest Of Three");
        } else {
            System.out.println("C : I'm The Largest Of Three");
        }
    }
}
