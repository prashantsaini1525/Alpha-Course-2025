public class FunctionSyntax {
    // returntype name() {
    //body
    //return Statement
    //}
    public static void printHelloWorld() { 
        //void does not return any values that's why it's not important to write return statements after the hello world body.
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        //not important to write return statements here because of void.
    }
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        printHelloWorld(); //functions call
    }
    
}
