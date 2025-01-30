# **Loops in Java**

## **What are Loops?**
Loops are used in programming to execute a block of code multiple times based on a condition. This helps in reducing redundancy and improving efficiency.

## **Types of Loops in Java**
### **1️⃣ for Loop**
Used when the number of iterations is known beforehand.

**Syntax:**
```java
for(initialization; condition; update) {
    // Code to execute
}
```

**Example:**
```java
for(int i = 1; i <= 5; i++) {
    System.out.println("Hello World!");
}
```

### **2️⃣ while Loop**
Used when the number of iterations is not known, and we only have a condition.

**Syntax:**
```java
while(condition) {
    // Code to execute
}
```

**Example:**
```java
int i = 1;
while(i <= 5) {
    System.out.println("Hello World!");
    i++;
}
```

### **3️⃣ do-while Loop**
Similar to `while`, but it executes at least once before checking the condition.

**Syntax:**
```java
do {
    // Code to execute
} while(condition);
```

**Example:**
```java
int i = 1;
do {
    System.out.println("Hello World!");
    i++;
} while(i <= 5);
```

## **Difference Between Loops**
| Loop Type | When to Use |
|-----------|------------|
| `for` loop | When the number of iterations is known |
| `while` loop | When the number of iterations is unknown but depends on a condition |
| `do-while` loop | When the loop should execute at least once, even if the condition is false |

## **Break and Continue in Loops**
### **`break` Statement**
Used to exit the loop completely.

**Example:**
```java
for(int i = 1; i <= 5; i++) {
    if(i == 3) {
        break;
    }
    System.out.println(i);
}
// Output: 1 2
```

### **`continue` Statement**
Used to skip the current iteration and move to the next.

**Example:**
```java
for(int i = 1; i <= 5; i++) {
    if(i == 3) {
        continue;
    }
    System.out.println(i);
}
// Output: 1 2 4 5
```

## **Conclusion**
Loops are essential for executing repetitive tasks efficiently. Choosing the right loop depends on the problem you are solving!
