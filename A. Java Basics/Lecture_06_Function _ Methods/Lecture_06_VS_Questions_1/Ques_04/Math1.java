public class Math1 {
    public static void main(String[] args) {
        double a = 28.5;
        double b = 4.1;

        // return the maximum of two numbers 
        System.out.println("Maximum of two numbers : " + Math.max(a, b) );
        // return the minimum of two numbers
        System.out.println("Minimum of two numbers : " + Math.min(a, b) );
        // return the absolute value of a number
        System.out.println("Absolute value of -28.5 : " + Math.abs(-28.5) );
        // return the average of two numbers
        System.out.println("Average of two numbers : " + avg(a, b) );
        // return the square root of a number
        System.out.println("Square root of 28.5 : " + Math.sqrt(28.5) );
        // return the power of a number
        System.out.println("28.5 raised to the power of 3 : " + Math.pow(28.5, 3) );
        // return the remainder of two numbers when divided by the first
        System.out.println("Remainder of 28.5 divided by 4.1 : " + Math.IEEEremainder(28.5, 4.1) );
        // return the natural logarithm of a number
        System.out.println("Natural logarithm of 28.5 : " + Math.log(28.5) );
        // return the logarithm of a number with a given base
        System.out.println("Logarithm of 28.5 with base 10 : " + Math.log10(28.5) );
        // return the cosine of an angle in radians
        System.out.println("Cosine of 90 degrees : " + Math.cos(Math.toRadians(90)) );
        // return the sine of an angle in radians
        System.out.println("Sine of 90 degrees : " + Math.sin(Math.toRadians(90)) );
        // return the tangent of an angle in radians
        System.out.println("Tangent of 90 degrees : " + Math.tan(Math.toRadians(90)) );
        // return the arc cosine of a number in radians
        System.out.println("Arc cosine of 0.5 : " + Math.toDegrees(Math.acos(0.5)) );
        // return the arc sine of a number in radians
        System.out.println("Arc sine of 0.5 : " + Math.toDegrees(Math.asin(0.5)) );
        // return the arc tangent of a number in radians
        System.out.println("Arc tangent of 0.5 : " + Math.toDegrees(Math.atan(0.5)) );
        // return the hyperbolic cosine of a number in radians
        System.out.println("Hyperbolic cosine of 0.5 : " + Math.cosh(0.5) );
        // return the hyperbolic sine of a number in radians
        System.out.println("Hyperbolic sine of 0.5 : " + Math.sinh(0.5) );
        // return the hyperbolic tangent of a number in radians
        System.out.println("Hyperbolic tangent of 0.5 : " + Math.tanh(0.5) );
        // return the hyperbolic arc cosine of a number in radians
        // System.out.println("Hyperbolic arc cosine of 0.5 : " + StrictMath.acosh(0.5) );
        // // return the hyperbolic arc sine of a number in radians
        // System.out.println("Hyperbolic arc sine of 0.5 : " + Math.asinh(0.5) );
        // // return the hyperbolic arc tangent of a number in radians
        // System.out.println("Hyperbolic arc tangent of 0.5 : " + Math.atanh(0.5) );
    }

    // custom method to calculate the average of two numbers
    public static double avg(double a, double b) {
        return (a + b) / 2;
    }
}
