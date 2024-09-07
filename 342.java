class firstArea {  // Define a class named firstArea
  int x, y;  // Declare two integer instance variables x and y

  public firstArea(int x, int y) {  // Constructor for firstArea that takes two integers x and y
    this.x = x;  // Assign the parameter x to the instance variable x
    this.y = y;  // Assign the parameter y to the instance variable y
  }

  public void print() {  // Define a method named print
    System.out.println(x + " " + y + " ");  // Print the values of x and y separated by a space
  }
}

class secondArea extends firstArea {  // Define a class named secondArea that extends firstArea
  int bb = 3;  // Declare an integer instance variable bb and initialize it to 3

  public secondArea(int i) {  // Constructor for secondArea that takes an integer i
    super(i, i + 1);  // Call the constructor of the superclass firstArea with i and i+1
  }

  public void print() {  // Override the print method in firstArea
    super.print();  // Call the print method of the superclass firstArea
    System.out.println(bb * bb);  // Print the square of bb
  }
}

public class Main {  // Define a public class named Main
  public static void main(String[] args) {  // Define the main method, the entry point of the program
    firstArea st = new secondArea(10);  // Create an instance of secondArea with argument 10 and assign it to a reference of type firstArea
    st.print();  // Call the print method on st
  }
}

// Output:
// 10 11
// 9
//  Explanation of Execution:

//  Class Definitions:
//
//  Class firstArea:
//
//  Instance Variables: x and y are declared.
//  Constructor: Initializes x and y with the provided arguments.
//  Method print: Prints the values of x and y.
//  Class secondArea:
//
//  Inherits: Extends firstArea.
//  Instance Variable: bb is initialized to 3.
//  Constructor: Calls the superclass constructor with i and i + 1.
//  Method print: Overrides the print method of firstArea. Calls the superclass print method and then prints the square of bb.
//  Main Method Execution:
//
//  Object Creation: firstArea st = new secondArea(10);
//  Calls the secondArea constructor with 10.
//  The secondArea constructor calls the firstArea constructor with 10 and 11.
//  x is set to 10 and y is set to 11.
//  Method Call: st.print();
//  Calls the overridden print method in secondArea.
//  The print method in secondArea calls the print method in firstArea, which prints 10 11.
//  Then, it prints the square of bb which is 9.
//  Summary:
//  The print method in secondArea first prints 10 11 from the firstArea class and then prints 9 (the square of 3).



//class firstArea {
//  int x, y;
//  public firstArea(int x, int y) {
//    this.x = x;
//    this.y = y;
//  }
//  public void print() {
//    System.out.println(x + " " + y + " ");
//  }
//}
//
//class secondArea extends firstArea {
//  int bb = 3;
//  public secondArea(int i) {
//    super(i, i + 1);
//  }
//  public void print() {
//    super.print();
//    System.out.println(bb*bb);
//  }
//}
//
//public class Main {
//  public static void main(String[] args) {
//    firstArea st = new secondArea(10);
//    st.print();
//  }
//}

// output
