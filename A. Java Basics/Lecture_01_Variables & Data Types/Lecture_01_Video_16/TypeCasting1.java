
public class TypeCasting1 {
    public static void main(String[] args) {
        char ch1 = 'a';
        char ch2 = 'b';
        char ch3 = 'c';
        int number1 = ch1;
        int number2 = ch2;
        int number3 = ch3;
        System.out.println(number1);
        System.out.println(number2); // Outputs 98 which is the ASCII value of 'b'
        System.out.println(number3); // Outputs 99 which is the ASCII value of 'b'


        char ch4 = 'A';
        char ch5 = 'B';
        char ch6 = 'C';
        int number4 = ch4;
        int number5 = ch5;
        int number6 = ch6;
        System.out.println(number4);
        System.out.println(number5); // Outputs 65 which is the ASCII value of 'A'
        System.out.println(number6); // Outputs 66 which is the ASCII value of 'B'


        char ch7 = '0';
        char ch8 = '1';
        char ch9 = '2';
        int number7 = ch7;
        int number8 = ch8;
        int number9 = ch9;
        System.out.println(number7);
        System.out.println(number8); // Outputs 49 which is the ASCII value of '1'
        System.out.println(number9); // Outputs 50 which is the ASCII value of '2'
    }
}
