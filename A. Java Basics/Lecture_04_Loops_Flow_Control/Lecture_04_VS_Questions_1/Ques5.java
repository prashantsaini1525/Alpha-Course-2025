public class Ques5 {
    public static void main(String args[]) {
        int i = 0; // Declare 'i' once outside the loop

        for (; i <= 5; i++) { // Use the existing 'i', don't redeclare it
            System.out.println("i = " + i);
        }

        System.out.println("i after the loop = " + i); // ✅ Now 'i' is accessible
    }
}
