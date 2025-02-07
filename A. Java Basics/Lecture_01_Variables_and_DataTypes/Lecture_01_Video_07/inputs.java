import java.util.*;

public class inputs {
    public static void main(String args []) {
    
    /*In scanner class sc can be write scn,sc,scanner and for take input we use system.in (jaise hum output print karwane k liye system.out.println
    likhte hain ) ye input leta hai jo hum terminal mein likhenge woh*/
    Scanner sc = new Scanner(System.in);
    
    /*sc object store the input with the help of next() function which is used for capture the input, and this
    capture input will be store with the help of String 'input' (isme input store ho jaata hai).

    NOTE: NEXT FUNCTION CAN STORE THE VALUE BEFORE THE SPACE BECAUSE NEXT FUNCTION CANNOT STORE THE VALUE OF AFTER SPACE EX: TONY STARK
    IN THIS WHEN WE COMPILE THE CODE THE OUTPUT WILL BE ONLY TONY BECAUSE NEXT FUNCTION CANNOT STORE THE VALUE AFTER SPACE. */
    
    /*String input = sc.next(); // store only one word
    System.out.println(input); //and for print the input we use this line. */
    
    /*In below .nextLine() can be store and print the output after space. Ex: tony stark.*/

    /*String input = sc.nextLine(); // store whole sentence or paragraph
    System.out.println(input);*/

    /*int number = sc.nextInt(); // store whole numbers.
    System.out.println(number); */

    /*float price = sc.nextFloat(); // can be store float numbers 6 to 7 decimals
    System.out.println(price);*/

    /*double prices = sc.nextDouble(); // can be store 15 decimal points.
    System.out.println(prices);*/

    boolean var = sc.nextBoolean(); // can be store only one value true/false.
    System.out.println(var);

    /*short min = sc.nextShort(); // can be store -32768 to +32767 numbers.
    System.out.println(min);*/

    /*long max = sc.nextLong(); // can be store -2billion to +2billion numbers.
    System.out.println(max);*/

    }
}
