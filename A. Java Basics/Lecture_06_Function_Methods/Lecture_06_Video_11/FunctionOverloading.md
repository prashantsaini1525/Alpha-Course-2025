# Function Overloading in Java - Quick Revision Notes

## Definition
Function overloading (commonly called *method overloading* in Java) is a feature that allows a class to have multiple methods with the same name as long as their parameter lists differ. This enables the same logical operation to be performed on different types or different numbers of inputs.

## Key Points
- **Same Name, Different Signatures:**  
  Overloaded methods must have the same name but a different parameter list (different number, type, or order of parameters).

- **Compile-Time Polymorphism:**  
  Overloading is resolved at compile time. The compiler determines which method to call based on the method signature.

- **Return Type Irrelevance:**  
  The return type of the method is not considered when overloading. Methods cannot be overloaded solely by changing the return type.

- **Improves Readability & Reusability:**  
  Using a single method name for similar operations makes code easier to read and maintain.

## Rules for Overloading
1. **Method Name:** All overloaded methods must share the same name.
2. **Parameter List:** They must have different parameter lists (number, type, or order).
3. **Return Type:** Changing only the return type is not enough to overload a method.
4. **Access Modifiers:** Overloaded methods can have different access modifiers; this does not affect overloading.
5. **Exception Handling:** They may also have different exception declarations.

## Example

Below is an example demonstrating three overloaded versions of an `add` method:

```java
public class Calculator {

    // Overloaded method: adds two integers
    public int add(int a, int b) {
        return a + b;
    }
    
    // Overloaded method: adds three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Overloaded method: adds two doubles
    public double add(double a, double b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("Sum of 2 and 3: " + calc.add(2, 3));          // Calls add(int, int)
        System.out.println("Sum of 2, 3, and 4: " + calc.add(2, 3, 4));    // Calls add(int, int, int)
        System.out.println("Sum of 2.5 and 3.5: " + calc.add(2.5, 3.5));   // Calls add(double, double)
    }
}
