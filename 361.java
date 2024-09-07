public class Problem {
  static int Stack[] = new int[5];
  static int top = -1;

  public static void push(int data) {
    if (top == 4) {
      System.out.println("Stack Overflow");
    } else {
      top++;
      Stack[top] = data;
    }
  }
  public satic void main(String[] args) {
    push(10);
    push(20);
    push(30);
    pop();
    push(40);
    push(50);
    pop();
  }
  static void push(int i) {
    Top++; // push
    if (Top >= 5) {
      System.out.println("Stack Overflow");
    } else {
      Stack[Top] = i;
    }
    static void pop() {
      if (Top < 0) {
        System.out.println("Stack Underflow");
      } else {
        System.out.println("Popped element: " + Stack[Top]);
        Top--; // pop
      }
    }
  }
}

//output


public class StackExample { // Define a public class named StackExample
  static int top = -1; // Declare a static integer variable 'top' initialized to -1 to keep track of the top of the stack
  static int[] Stack = new int[5]; // Declare a static integer array 'Stack' with a size of 5

  // Method to push an element onto the stack
  public static void push(int data) {
    if (top == 4) { // Check if the stack is full
      System.out.println("Stack Overflow"); // Print stack overflow message
    } else {
      top++; // Increment the top index
      Stack[top] = data; // Add the data to the stack at the top index
    }
  }

  // Method to pop an element from the stack
  public static void pop() {
    if (top < 0) { // Check if the stack is empty
      System.out.println("Stack Underflow"); // Print stack underflow message
    } else {
      System.out.println("Popped element: " + Stack[top]); // Print the popped element
      top--; // Decrement the top index
    }
  }

  // Main method, entry point of the program
  public static void main(String[] args) {
    push(10); // Push 10 onto the stack
    push(20); // Push 20 onto the stack
    push(30); // Push 30 onto the stack
    pop(); // Pop the top element from the stack
    push(40); // Push 40 onto the stack
    push(50); // Push 50 onto the stack
    pop(); // Pop the top element from the stack
  }
}

// This code defines a class StackExample with methods to push and pop elements from a stack, and a main method to demonstrate stack operations. The code has been corrected for syntax errors and logical issues.

