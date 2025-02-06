# Memory Management in Java: Functions and `main`

## 1. **JVM Memory Structure**
Java memory is managed by the JVM and divided into:
- **Stack Memory**: Stores method calls, local variables, and references.
- **Heap Memory**: Stores objects and instance variables.
- **Method Area**: Stores class metadata, static variables, and method bytecode.
- **PC Registers**: Track the current execution point.
- **Native Method Stack**: For native (non-Java) method calls.

---

## 2. **Execution Flow of `main`**
- **Step 1**: JVM loads the class containing `public static void main(String[] args)` into the **method area**.
- **Step 2**: A **stack frame** for `main` is created in the **stack memory**.
  - Local variables (e.g., `args`) are stored in this frame.
  - Primitive variables (e.g., `int x = 5`) are stored directly in the stack.
  - Object variables store **heap references** (e.g., `String s = new String("Hello")`).

---

## 3. **Function/Method Calls**
- When a method is called:
  1. A new **stack frame** is pushed onto the stack.
  2. Parameters and local variables of the method are stored in this frame.
  3. Objects created inside the method are stored in the **heap** (references in the stack).
- Example:
  ```java
  public static void main(String[] args) {
      int result = calculateSum(3, 4); // Stack frame for calculateSum is created
  }
  
  static int calculateSum(int a, int b) {
      return a + b; // Parameters a, b stored in calculateSum's stack frame
  }

## What Happens in Memory?

## 1️⃣ Class Loading (Method Area)
The MemoryExample class is loaded into the Method Area.
The method definitions (add() and main()) are stored as bytecode.

## 2️⃣ Execution of main() (Stack)
A stack frame is created for the main() method in the Stack Area.
obj (reference variable) is created in the stack, pointing to an object in the Heap Area.

## 3️⃣ Object Creation (Heap)
new MemoryExample(); creates an object in the Heap.
The reference obj in the stack points to the Heap memory location of the object.

## 4️⃣ Function Call (add())
A new stack frame for add() is created in the Stack Area.
The parameters a = 5 and b = 3 are stored in the stack frame of add().
The return value (8) is passed back to main().

## 5️⃣ Function Returns
The stack frame of add() is removed (popped) from the stack after execution.
The returned value is stored in sum in main().

## 6️⃣ Program Completion
Once main() finishes execution, its stack frame is removed.
JVM performs Garbage Collection to free up unused objects in the Heap.