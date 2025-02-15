
public class BlockScope {

    public static void main(String[] args) { // block scope for main 
        int p = 10;

        { //this block scope is used to only access the which code is defined in this block scope 
            int s = 45;
            System.out.println("inner block scope : " + s);
            System.out.println("main p print in inner block scope : " + p); //this can be used anywhere because it is defined in main block scope or block scope.
        }
        // System.out.println(s); // s cannot be resolved to a variable
        System.out.println("under main block scope : " + p);

        for (int i = 1; i <= 5; i++) { //this block scope is used to only access the which code is defined in this block scope.
            int j = 5;
            System.out.println("Under for loop scope : " + (i * j));
        }
        // System.out.println(i * j); // i *j cannot be resolved to a variable
    }
}
