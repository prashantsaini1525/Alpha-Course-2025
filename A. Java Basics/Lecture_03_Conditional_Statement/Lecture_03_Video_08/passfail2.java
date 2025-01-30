import java.util.*;

public class passfail2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Marks :");
        int marks = sc.nextInt();

        String Result =  (marks > 100 || marks < 0)? "Invalid Marks" :(marks >= 33)? "Congratulations! Your have Passed" : "Sorry! Your have Failed";

        System.out.println(Result);
        sc.close();
    }
    
}
