# Introduction to Functions & Methods

In programming, **functions** and **methods** are reusable blocks of code that perform a specific task. They help to organize code, make it more readable, and promote reuse.

---

## What is a Function?

A **function** is a self-contained block of code designed to perform a specific task. It may take inputs (called parameters) and return an output (using the `return` statement). Functions help reduce code repetition and improve modularity.

### Key Points:
- **Reusable**: Write once and call it many times.
- **Encapsulation**: Encapsulate code logic.
- **Parameters & Arguments**: Accept inputs to work with.
- **Return Value**: May produce an output after processing.

### Example in Java:
```java
// Method signature
public static void main(String[] args) {
    // Method body: Contains the code to execute
}

# What is a Method?

A **method** is similar to a function but is associated with an object or a class. In Java, methods are defined within a class and are used to perform operations using the attributes of that class.

---

### Key Points:

- **Belongs to a Class:** Methods are defined inside a class.
- **Access Data:** They operate on data (attributes) of the object.
- **Types of Methods in Java:**
  - **Instance Methods:** Require an instance of the class to be called. They typically operate on instance variables.
  - **Static Methods:** Declared with the `static` keyword. They belong to the class and can be called without creating an instance.
  - **Note:** In Java, there isn't a direct equivalent to Python's `@classmethod` since class-level behavior is often handled through static methods or other design patterns.

---

## Examples

### 1. Instance Methods

Instance methods require an object of the class to be invoked. They can access instance variables and other instance methods.

```java
public class MyClass {
    private int value;

    // Constructor to initialize value
    public MyClass(int value) {
        this.value = value;
    }

    // Instance method to display the value
    public void displayValue() {
        System.out.println("The value is: " + this.value);
    }

    public static void main(String[] args) {
        // Creating an object of MyClass
        MyClass obj = new MyClass(10);
        obj.displayValue(); // Output: The value is: 10
    }
}
