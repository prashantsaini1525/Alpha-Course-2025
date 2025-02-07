# Scope in Java

In Java, **scope** refers to the region of a program where a variable, method, or object is accessible. Understanding scope is crucial for writing clean, maintainable code and avoiding common errors such as variable conflicts and unintended data modification.

## Types of Scope in Java

Java defines scope based on where variables or methods are declared. The primary types are:

### 1. Local Scope (Method/Block Scope)

- **Local Variables:**  
  Variables declared within a method or a block are known as local variables. They can only be accessed within the method or block in which they are defined.
  - **Method Scope:** Variables declared inside a method.
  - **Block Scope:** Variables declared within a pair of curly braces `{}` inside a method.
  
- **Example:**

  <!-- ```java -->
  public void exampleMethod() {
      int localVar = 10; // Local variable accessible only within exampleMethod()

      {
          int blockVar = 20; // Block-scoped variable, only accessible within this inner block
          System.out.println("Block variable: " + blockVar);
      }
      // System.out.println(blockVar); // Error: blockVar is not accessible here
  }


### 2. Instance Scope (Object Scope)

- **Instance Variables (Non-static Fields):** 

Variables declared in a class but outside any method (and not marked as static) are instance variables. Each object (instance) of the class has its own copy of these variables.

- **Example:**
<!-- ```java -->
public class Person {
    private String name; // Instance variable

    public Person(String name) {
        this.name = name;
    }
    
    public void display() {
        System.out.println("Name: " + name);
    }
}

### 3. Class Scope (Static Scope)
- **Static Variables (Class Variables):** 
Variables declared with the static keyword belong to the class rather than any individual instance. They are shared across all instances of the class.

- **Static Methods:**
Methods marked with static can be called without creating an instance of the class.

- **Example:**
<!-- ```java -->
public class Counter {
    public static int count = 0; // Static variable

    public Counter() {
        count++;
    }

    public static void displayCount() { // Static method
        System.out.println("Count: " + count);
    }
}

### 4. Parameter Scope

- **Method Parameters:**
Variables passed to methods as parameters are only accessible within the method during its execution.

- **Example:**
<!-- ```java -->
public void greet(String name) { // 'name' is a parameter
    System.out.println("Hello, " + name);
}

### 5. Package (Default) Scope

- **Default Access (Package-Private):**
If no access modifier (public, protected, or private) is specified, classes, methods, and variables have default access, meaning they are accessible only within the same package.

- **Example:**
<!-- ```java -->
// This class is package-private because no modifier is specified.
class PackageClass {
    int value; // Package-private variable
}

## Summary

- **Local Scope:**
Variables declared inside methods or blocks; not accessible outside.

- **Instance Scope:**
Non-static variables that belong to an instance of a class; each object gets its own copy.

- **Class (Static) Scope:**
Variables and methods declared as static belong to the class itself; shared among all instances.

- **Parameter Scope:**
Method parameters; only available during the execution of the method.

- **Package (Default) Scope:**
Members with no explicit access modifier; accessible only within the same package.
