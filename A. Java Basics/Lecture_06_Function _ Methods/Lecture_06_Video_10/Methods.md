# Java Methods Theory Notes

## Overview

In Java, a **method** is a block of code that performs a specific task and is defined within a class. Methods are essential for:
- Encapsulating behavior
- Promoting code reusability
- Organizing code into modular units

Java methods can be broadly categorized into:
- **Built-in (Inbuilt) Methods:** Predefined methods provided by Java’s standard libraries.
- **User-Defined Methods:** Methods written by the programmer to perform custom operations.

---

## Built-in Methods

**Built-in methods** come with the Java API. They are already defined and ready for use, which means you do not need to write these methods yourself. Common examples include:

- **Input/Output:**
  - `System.out.println()`
  - `System.out.print()`

- **Math Operations:**
  - `Math.sqrt()`
  - `Math.pow()`
  - `Math.max()`

- **String Manipulation:**
  - `String.length()`
  - `String.charAt()`
  - `String.toUpperCase()`
  - `String.toLowerCase()`

These methods are part of classes like `System`, `Math`, and `String` and are optimized and well-tested.

> **Example:** Using a built-in method to calculate the square root.
>
> ```java
> public class Example {
>     public static void main(String[] args) {
>         double result = Math.sqrt(16);
>         System.out.println("Square root: " + result);
>     }
> }
> ```
>
> *Source: W3Schools Java Methods*  
> :contentReference[oaicite:0]{index=0}

---

## User-Defined Methods

**User-defined methods** are created by you, the programmer, to solve specific problems or encapsulate custom functionality. They are defined inside your classes using the following syntax:

```java
<access_modifier> [static] <return_type> methodName(<parameter_list>) {
    // method body: statements to execute
    // Optional: return statement if <return_type> is not void
}

# Comparison: Built-in vs. User-Defined Methods

| **Aspect**         | **Built-in Methods**                                               | **User-Defined Methods**                              |
|--------------------|--------------------------------------------------------------------|-------------------------------------------------------|
| **Source**         | Provided by the Java API                                           | Written by the programmer                             |
| **Availability**   | Always available in standard libraries                             | Available after you define them in your code          |
| **Purpose**        | General-purpose operations (I/O, math, string manipulation, etc.)  | Custom functionality specific to your application     |
| **Implementation** | Developed and maintained by Java developers                        | You implement the logic tailored to your needs        |
| **Examples**       | `System.out.println()`, `Math.sqrt()`, `String.toUpperCase()`      | `calculateArea()`, `addNumbers()`, `displayInfo()`    |
