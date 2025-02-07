# Function Overloading in Java

Function overloading (often called **method overloading**) is a core feature of Java that allows a class to have more than one method with the same name, as long as their **parameter lists** (i.e., type, number, or order of parameters) differ. This capability enhances code readability, reusability, and enables **compile-time polymorphism**.

## Overview

- **Definition:**  
  Function overloading means creating multiple methods in the same class that share the same name but have different parameter lists. The compiler determines which method to invoke at compile time based on the method signature.

- **Key Concept – Method Signature:**  
  The method signature consists of the method name and the types (and order) of its parameters. Note that the return type is **not** part of the method signature and does not contribute to overloading.

## Why Use Function Overloading?

- **Improved Readability:**  
  Using a single method name for similar operations reduces the need for multiple method names and makes the code easier to understand.

- **Increased Reusability:**  
  Overloading allows methods to handle different types or numbers of inputs, reducing redundancy.

- **Compile-Time Polymorphism:**  
  The Java compiler determines the correct method to call based on the arguments provided during the method call, resulting in efficient and predictable behavior.

## Rules for Function Overloading

1. **Different Parameter Lists:**
   - Methods must differ in the number of parameters.
   - Methods must differ in the data types of parameters.
   - Methods must differ in the order of parameters if the types are different.
2. **Same Name:**  
   All overloaded methods share the same name.

3. **Return Type:**  
   The return type of the methods can be the same or different, but it does not affect method overloading. Overloading by return type alone is not allowed.

4. **Access Modifiers:**  
   Overloaded methods can have different access modifiers (public, private, etc.) and even throw different exceptions.

## Types of Overloading by Parameters

### 1. Changing the Number of Parameters

Overloading by varying the number of parameters is the most common approach.

**Example:**

<!-- ```java -->

// class Calculator {
// // Method to add two numbers
// int add(int a, int b) {
// return a + b;
// }

// // Overloaded method to add three numbers
// int add(int a, int b, int c) {
// return a + b + c;
// }
// }

### 2. Changing the Data Types of Parameters

You can also overload methods by changing the parameter types.

**Example:**

class Converter {
// Convert integer to string
String convert(int number) {
return String.valueOf(number);
}

    // Overloaded method to convert double to string
    String convert(double number) {
        return String.valueOf(number);
    }

}

### 3. Changing the Order of Parameters

If the parameters are of different types, you can overload methods by switching their order.

**Example:**

class Display {
// Display method with String and int parameters
void show(String message, int number) {
System.out.println(message + " " + number);
}

    // Overloaded method with reversed parameter order
    void show(int number, String message) {
        System.out.println(number + " " + message);
    }

}

**Complete Code Example:**

public class OverloadingExample {

    // Overloaded methods with different parameter lists

    // Method with one integer parameter
    void display(int a) {
        System.out.println("Integer: " + a);
    }

    // Method with one double parameter
    void display(double a) {
        System.out.println("Double: " + a);
    }

    // Method with two integer parameters
    void display(int a, int b) {
        System.out.println("Two Integers: " + a + ", " + b);
    }

    // Method with a String and an integer parameter (order matters)
    void display(String str, int a) {
        System.out.println("String and Integer: " + str + ", " + a);
    }

    public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();

        obj.display(5);            // Calls method with int parameter
        obj.display(5.5);          // Calls method with double parameter
        obj.display(3, 7);         // Calls method with two int parameters
        obj.display("Hello", 10);  // Calls method with String and int parameters
    }

}
