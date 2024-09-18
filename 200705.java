// Define the Parent class
class Parent {
    // Method to print "Parent"
    void show() {
        System.out.println("Parent");
    }
}

// Define the Child class that extends Parent
class Child extends Parent {
    // Override the show method to print "Child"
    void show() {
        System.out.println("Child");
    }
}

// Main class to test the functionality
public class Test {
    // Main method - entry point of the program
    public static void main(String[] args) {
        // Create a Parent reference pointing to a Child object
        Parent pa = new Child();
        // Call the show method, which will print "Child" due to polymorphism
        pa.show();
    }
}
// Output
// Child