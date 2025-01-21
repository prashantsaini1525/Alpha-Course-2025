

public class FirstTypePromotion1 {
    public static void main(String[] args) {
        short a = 5;
        byte b = 10;
        char c = 'c';

        //possible lossy conversion from int to byte
        //byte bt = a + b + c;
        
        byte bt = (byte)(a + b + c);
        System.out.println(bt);
    }
    
}
