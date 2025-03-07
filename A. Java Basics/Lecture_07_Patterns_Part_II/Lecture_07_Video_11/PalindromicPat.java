public class PalindromicPat {

    public static void palindromic_pattern(int n){
        //outer loop
        for(int i = 1; i <=n; i++){
            //spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            //numbers descending order
            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }
            //numbers ascending order
            for(int j = 2; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        palindromic_pattern(5);
    }
}
