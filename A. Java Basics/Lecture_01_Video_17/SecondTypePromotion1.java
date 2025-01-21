public class SecondTypePromotion1 {
    public static void main(String[] args) {
        byte a = 5;
        
        //possible lossy conversion from int to byte
        //byte a = b * 2;

        // byte a = (byte) (a * 2);
        byte b = (byte) (a * 2);
        
        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);
    }
    
}
