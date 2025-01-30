import java.util.Scanner;

public class smallestthree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Type First Number :");
        int A = sc.nextInt();
        System.out.print("Type Second Number :");
        int B = sc.nextInt();
        System.out.print("Type Third Number :");
        int C = sc.nextInt();

        String Result = (A <= B && A <=C )? "A is the Smallest Number" :
        (B <= A && B <= C )? "B is the Smallest Number" : "C is the Smallest Number";

        System.out.println(Result);
        
        sc.close();
    }
    
}
