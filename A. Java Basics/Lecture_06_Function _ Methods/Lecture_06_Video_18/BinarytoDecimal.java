public class BinarytoDecimal {

    public static void bintoDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            pow++; //increment
            binNum = binNum / 10; //remove last digit from binary number
        }

        System.out.println("Decimal of " + myNum +" = "+ decNum);
    }
    public static void main(String[] args) {
        bintoDec(111);
    }
}
