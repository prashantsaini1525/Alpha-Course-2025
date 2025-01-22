
public class AirthmeticOperators {

    public static void main(String[] args) {
        int A = 50;
        int B = 5;

        //First Method to perform operations
        int Sum = A + B;
        int Sub = A - B;
        int Mul = A * B;
        int Div = A / B;
        int Mod = A % B;
        int Mod2 = A % 2;
        double Div2 = (double) A / B;
        
        System.out.println("Sum of A and B : " + Sum);
        System.out.println("Subtraction of A and B : " + Sub);
        System.out.println("Multiplication of A and B : " + Mul);
        System.out.println("Division of A and B : " + Div);
        System.out.println("Modulus of A and B : " + Mod);
        System.out.println("Modulus of A and 2 : " + Mod2);
        System.out.println("Division of A and B : " + Div2);
    }
}
