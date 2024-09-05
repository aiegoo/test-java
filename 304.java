import javax.swing.Box;

class A {
  int a;

  public A(int a) {
    this.a = a;
  }

  // Assuming display() method should be defined in class A
  public void display() {
    System.out.println("Value of a: " + a);
  }
}

class B extends A {
  public B(int a) {
    super(a);
    super.display();
  }
}

public class Test {
  public static void main(String[] args) {
    B obj = new B(10);
  }
}
// Value of a: 10
// Class B inherits from class A.
// When an object of class B is created, it initializes the instance variable a in class A and then calls the display method from class A to print the value of a.
// When new B(10) is executed: The constructor of class B is called with a = 10.
// vThe constructor of class B calls the constructor of class A with super(a), which initializes the instance variable a in class A to 10.
// The display method of class A is then called, which prints Value of a: 10 to the console.
