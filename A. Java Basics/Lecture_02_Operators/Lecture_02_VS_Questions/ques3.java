public class ques3 {

    public static void main(String[] args) {
        // int x, y, z;

        float x, y, z;

        x = y = z = 2;
        
        x += y;
        y -= z;
        z /= (x + y);

        System.out.println(x +" " + y + " " + z);
        System.out.println(x + y + z);
    }
    
}
