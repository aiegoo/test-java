class ClassA {
  // Constructor of ClassA
  ClassA() {
    // Print 'A' when an object of ClassA is created
    System.out.print('A');
    // Call the prn() method
    this.prn();
  }

  // Method to print 'B'
  void prn() {
    System.out.print('B');
  }
}

class ClassB extends ClassA {
  // Constructor of ClassB
  ClassB() {
    // Call the constructor of the superclass (ClassA)
    super();
    // Print 'D' after the superclass constructor completes
    System.out.print('D');
  }

  // Override the prn() method to print 'E'
  void prn() {
    System.out.print('E');
  }

  // Overloaded prn() method to print an integer
  void prn(int x) {
    System.out.print(x);
  }
}

// When an object of ClassB is created, the output will be:
// 'A' from ClassA constructor
// 'E' from the overridden prn() method in ClassB
// 'D' from ClassB constructor
// If prn(int x) is called with 7, it will print '7'
// Hence, the final output is 'AED7'
// AED7
