class Car implements Runnable {
  int a;
  public void run() {
    try {
      while (++a < 100) {
        System.out.println("Miles Traveled : " + a);
        Thread.sleep(1000);
      }
} catch (Exception E) {}
  }
}

public class Test {
  public static void main(String[] args) {
  //  Car c = new Car();
    Thread t1 = new Thread(new Car());
    t1.start();
  }
}

//output
// Miles Traveled : 1
// Miles Traveled : 2
// answer is Car

class Car implements Runnable { // Define a class `Car` that implements the `Runnable` interface
  int a; // Declare an integer variable `a`

  public void run() { // Override the `run` method from the `Runnable` interface
    try { // Start a try block to handle exceptions
      while (++a < 100) { // Increment `a` and check if it is less than 100
        System.out.println("Miles Traveled : " + a); // Print the value of `a`
        Thread.sleep(1000); // Pause the thread for 1000 milliseconds (1 second)
      }
    } catch (Exception E) {} // Catch any exceptions that occur and do nothing
  }
}

public class Test { // Define a public class `Test`
  public static void main(String[] args) { // Define the main method
    Car c = new Car(); // Create an instance of the `Car` class
    Thread t1 = new Thread(c); // Create a new thread with the `Car` instance as the target
    t1.start(); // Start the thread, which calls the `run` method of the `Car` instance
  }
}

// Output
// Miles Traveled : 1
// Miles Traveled : 2
// ...
// Miles Traveled : 99
// Miles Traveled : 100
